package com.plic.plicapi.service.custom;


import com.plic.plicapi.controller.model.request.TicketRequest;
import com.plic.plicapi.controller.model.response.TicketResponse;
import com.plic.plicapi.domain.Ticket;

import java.util.List;


public interface TicketService {
    void createTicket(TicketRequest ticketRequest);
    List<TicketResponse> readTickets(String userId);
    List<TicketResponse> readUnscoredTickets(String userId);
    List<TicketResponse> readScoredTickets(String userId);
    List<TicketResponse> readNocommentTickets(String userId);
    List<TicketResponse> readCommentTickets(String userId);
    Ticket updateTicket(TicketRequest ticketRequest);
    void deleteTicket(Long Id);
    List<TicketResponse> readTicketHistory(String userId, String mt20id);
}
