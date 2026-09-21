package xyz.sbong.risk_management.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.sbong.risk_management.user.entity.User;
import xyz.sbong.risk_management.user.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public User create(@RequestBody User user) {
        // Implement the logic to create a new user
        return userService.create(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        // Implement the logic to authenticate the user
        return "success!";
    }
    @GetMapping("/all")
    public List<User> getAllUsers() {
        // Implement the logic to get all users
        return userService.getAllUsers();
    }
}
