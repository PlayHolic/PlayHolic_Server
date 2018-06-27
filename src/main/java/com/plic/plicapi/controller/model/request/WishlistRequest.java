package com.plic.plicapi.controller.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WishlistRequest {
    Long Id;
    Long userId;
    String fcltynm;
    String prfnm;
    String prfpdfrom;
    String prfpdto;
    String poster;
}
