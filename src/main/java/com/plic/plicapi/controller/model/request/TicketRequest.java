package com.plic.plicapi.controller.model.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketRequest {
    Long Id;
    String userId;
    String mt20id;
    String fcltynm;
    String prfnm;
    String prfruntime;
    String prfage;
    String prfcast;
    String prfcrew;
    String score;
    String comment;
}
