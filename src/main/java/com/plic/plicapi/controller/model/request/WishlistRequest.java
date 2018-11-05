package com.plic.plicapi.controller.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WishlistRequest {
    Long id;
    String userId;
    String fcltynm;
    String prfnm;
    String prfpdfrom;
    String prfpdto;
    String poster;
}
