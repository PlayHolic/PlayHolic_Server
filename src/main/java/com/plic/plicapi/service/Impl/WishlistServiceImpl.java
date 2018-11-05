package com.plic.plicapi.service.Impl;

import com.plic.plicapi.controller.exception.WishlistNotFoundException;
import com.plic.plicapi.controller.model.request.WishlistRequest;
import com.plic.plicapi.controller.model.response.WishlistResponse;
import com.plic.plicapi.domain.Wishlist;
import com.plic.plicapi.repository.WishlistRepository;
import com.plic.plicapi.service.custom.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WishlistServiceImpl implements WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    @Override
    public void createWishlist(WishlistRequest wishlistRequest) {
        Wishlist wishlist = new Wishlist();
        wishlist.setUserId(wishlistRequest.getUserId());
        wishlist.setFcltynm(wishlistRequest.getFcltynm());
        wishlist.setPrfnm(wishlistRequest.getPrfnm());
        wishlist.setPrfpdfrom(wishlistRequest.getPrfpdfrom());
        wishlist.setPrfpdto(wishlistRequest.getPrfpdto());
        wishlist.setPoster(wishlistRequest.getPoster());

        this.wishlistRepository.save(wishlist);
    }

    @Override
    public void deleteWishlist(Long id) {
        Optional<Wishlist> wishlistOptional = Optional.ofNullable(this.wishlistRepository.getOne(id));

        if(!wishlistOptional.isPresent()){
            throw new WishlistNotFoundException("존재하지 않는 티켓입니다.");
        }else {
            Wishlist wishlist = wishlistOptional.get();
            this.wishlistRepository.delete(wishlist);
        }

    }

    @Override
    public List<WishlistResponse> readWishlists(String userId) {
        List<Wishlist> wishlists = this.wishlistRepository.findByUserId(userId);
        List<WishlistResponse> wishlistResponses = new ArrayList<>();

        wishlists.forEach(wishlist -> wishlistResponses.add(WishlistResponse.of(wishlist)));

        return  wishlistResponses;
    }
}
