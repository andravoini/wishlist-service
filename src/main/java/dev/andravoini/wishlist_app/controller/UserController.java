package dev.andravoini.wishlist_app.controller;

import dev.andravoini.wishlist_app.model.user.User;
import dev.andravoini.wishlist_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userServiceIn) {
        this.userService = userServiceIn;
    }

    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
//CRUD, pagination, sorting, etc