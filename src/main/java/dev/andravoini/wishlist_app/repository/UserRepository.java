package dev.andravoini.wishlist_app.repository;

import dev.andravoini.wishlist_app.model.user.User;
import dev.andravoini.wishlist_app.model.wishList.WishListEntry;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public UserRepository(){ }

    public List<User> findAll() {
        return users;
    }

    public Optional<User> findById(UUID id) {
        return users.stream().filter(user -> id.equals(user.getId())).findFirst();
    }

    @PostConstruct
    private void init() {
        User user = new User(
                UUID.randomUUID(),
                "Andra",
                "andra@email.com",
                List.of(),
                List.of());

        users.add(user);
    }
}
