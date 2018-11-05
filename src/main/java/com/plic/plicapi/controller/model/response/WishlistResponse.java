package com.plic.plicapi.controller.model.response;

import com.plic.plicapi.domain.Wishlist;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class WishlistResponse {
    Long id;
    String userId;
    String fcltynm;
    String prfnm;
    String prfpdfrom;
    String prfpdto;
    String poster;

    public static WishlistResponse of(Wishlist wishlist) {
        return WishlistResponse.builder()
                .id(wishlist.getId())
                .userId(wishlist.getUserId())
                .fcltynm(wishlist.getFcltynm())
                .prfnm(wishlist.getPrfnm())
                .prfpdfrom(wishlist.getPrfpdfrom())
                .prfpdto(wishlist.getPrfpdto())
                .poster(wishlist.getPoster())
                .build();
    }

}
