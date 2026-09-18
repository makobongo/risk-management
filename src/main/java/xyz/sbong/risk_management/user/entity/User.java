package xyz.sbong.risk_management.user.entity;

import jakarta.persistence.Entity;
import lombok.*;
import xyz.sbong.risk_management.common.BaseEntity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
