package com.plic.plicapi.controller.model.response;

import com.plic.plicapi.domain.Ticket;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TicketResponse {
    Long id;
    String userId;
    String mt20id;
    String fcltynm;
    String prfnm;
    String score;
    String comment;
    String prfruntime;
    String prfage;
    String prfcast;
    String prfcrew;

    public static TicketResponse of(Ticket ticket) {
        return TicketResponse.builder()
                .id(ticket.getId())
                .userId(ticket.getUserId())
                .mt20id(ticket.getMt20id())
                .fcltynm(ticket.getFcltynm())
                .prfnm(ticket.getPrfnm())
                .prfruntime(ticket.getPrfruntime())
                .prfage(ticket.getPrfage())
                .prfcast(ticket.getPrfcast())
                .prfcrew(ticket.getPrfcrew())
                .score(ticket.getScore())
                .comment(ticket.getComment())
                .build();
    }
}
