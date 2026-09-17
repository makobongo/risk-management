# Use an official OpenJDK image with Maven pre-installed
FROM eclipse-temurin:25-jdk-jammy

# Set the working directory inside the container
WORKDIR /app

# Install Maven so we can run mvn spring-boot:run inside the container
RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*

# 1. Copy only the pom.xml first to cache dependencies
COPY pom.xml .

# 2. Download all dependencies *while you still have internet* so they are saved to the image/cache
RUN mvn dependency:go-offline -B

# Expose the default Spring Boot port
EXPOSE 8080

# Command to run Spring Boot in development mode with automatic restart enabled
CMD ["mvn", "spring-boot:run", "-o"]