package com.plic.plicapi.controller.model.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KeywordRequest {
    Long id;
    String userId;
    String word;
    String date;
}
