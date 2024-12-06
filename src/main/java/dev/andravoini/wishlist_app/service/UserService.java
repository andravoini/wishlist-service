package dev.andravoini.wishlist_app.service;

import dev.andravoini.wishlist_app.model.user.User;
import dev.andravoini.wishlist_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepositoryIn) {
        this.userRepository = userRepositoryIn;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //public User getUser(UUID id) {
    //    return userRepository.findById(id).orElseThrow(new );
    //}
}
