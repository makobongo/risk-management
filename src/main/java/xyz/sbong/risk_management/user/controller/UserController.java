package xyz.sbong.risk_management.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String welcome() {
        return "Hello, World!";
    }
}
