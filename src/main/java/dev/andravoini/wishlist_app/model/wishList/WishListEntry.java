package dev.andravoini.wishlist_app.model.wishList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class WishListEntry {
    private WishListEntryStatus status;
    private List<UUID> productIds;
    private int quantityNeeded;
    private int quantityPurchased;
    private String notes;
}
