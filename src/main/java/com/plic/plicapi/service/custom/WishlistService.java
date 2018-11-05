package com.plic.plicapi.service.custom;

import com.plic.plicapi.controller.model.request.WishlistRequest;
import com.plic.plicapi.controller.model.response.WishlistResponse;

import java.util.List;

public interface WishlistService {
    void createWishlist(WishlistRequest wishlistRequest);
    void deleteWishlist(Long Id);

    List<WishlistResponse> readWishlists(String userId);
}
