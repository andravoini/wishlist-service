package dev.andravoini.wishlist_app.model.user;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @Test
    void createUser() {
        UUID uuid =  UUID.randomUUID();
        User user = new User(uuid, "name", "email", List.of(), List.of());
        assertEquals(uuid, user.getId());
    }
}