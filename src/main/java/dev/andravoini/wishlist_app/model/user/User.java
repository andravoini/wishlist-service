package dev.andravoini.wishlist_app.model.user;

import dev.andravoini.wishlist_app.model.wishList.WishListEntry;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class User {
    UUID id;
    String name;
    String email;
    List<User> friends;
    List<WishListEntry> wishList;
}
