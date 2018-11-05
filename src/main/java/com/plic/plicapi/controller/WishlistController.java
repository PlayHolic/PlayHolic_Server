package com.plic.plicapi.controller;

import com.plic.plicapi.controller.model.request.WishlistRequest;
import com.plic.plicapi.controller.model.response.WishlistResponse;
import com.plic.plicapi.service.custom.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/wishlists")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createWishlist(@RequestBody WishlistRequest wishlistRequest) {
        this.wishlistService.createWishlist(wishlistRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{Id}")
    public ResponseEntity deleteWishlist(@PathVariable Long Id) {
        this.wishlistService.deleteWishlist(Id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public ResponseEntity<List<WishlistResponse>> readWishlists(@PathVariable String userId) {
        List<WishlistResponse> wishlistResponses = this.wishlistService.readWishlists(userId);
        return new ResponseEntity<>(wishlistResponses, HttpStatus.OK);
    }
}
