package com.plic.plicapi.controller.model.response;

import com.plic.plicapi.domain.Ticket;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TicketResponse {
    Long Id;
    Long userId;
    String prfid;
    String fcltynm;
    String prfnm;
    String score;
    String comment;

    public static TicketResponse of(Ticket ticket) {
        return TicketResponse.builder()
                .Id(ticket.getId())
                .userId(ticket.getUserId())
                .prfid(ticket.getPrfid())
                .fcltynm(ticket.getFcltynm())
                .prfnm(ticket.getPrfnm())
                .score(ticket.getScore())
                .comment(ticket.getComment())
                .build();
    }
}
