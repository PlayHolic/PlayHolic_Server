package com.plic.plicapi.controller.model.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketRequest {
    Long Id;
    Long userId;
    String prfid;
    String fcltynm;
    String prfnm;
    String score;
    String comment;
}
