package com.plic.plicapi.service.custom;


import com.plic.plicapi.controller.model.request.TicketRequest;
import com.plic.plicapi.controller.model.response.TicketResponse;
import com.plic.plicapi.domain.Ticket;

import java.util.List;


public interface TicketService {
    void createTicket(TicketRequest ticketRequest);
    List<TicketResponse> readTickets(Long userId);
    List<TicketResponse> readUnscoredTickets(Long userId);
    List<TicketResponse> readScoredTickets(Long userId);
    List<TicketResponse> readNocommentTickets(Long userId);
    List<TicketResponse> readCommentTickets(Long userId);
    Ticket updateTicket(TicketRequest ticketRequest);
    void deleteTicket(Long Id);
}
