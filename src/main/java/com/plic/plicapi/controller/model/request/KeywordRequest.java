package com.plic.plicapi.controller.model.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KeywordRequest {
    Long Id;
    Long userId;
    String word;
    String date;
}
