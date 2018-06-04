package com.plic.plicapi.service.Impl;

import com.plic.plicapi.controller.TicketNotFoundException;
import com.plic.plicapi.controller.model.request.TicketRequest;
import com.plic.plicapi.controller.model.response.TicketResponse;
import com.plic.plicapi.domain.Ticket;
import com.plic.plicapi.repository.TicketRepository;
import com.plic.plicapi.service.custom.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public void createTicket(TicketRequest ticketRequest) {
        Ticket ticket = new Ticket();
        ticket.setUserId(ticketRequest.getUserId());
        ticket.setPrfid(ticketRequest.getPrfid());
        ticket.setFcltynm(ticketRequest.getFcltynm());
        ticket.setPrfnm(ticketRequest.getPrfnm());

        this.ticketRepository.save(ticket);
    }

    @Override
    public List<TicketResponse> readTickets(Long userId) {
        List<Ticket> tickets = this.ticketRepository.findByuserId(userId);
        List<TicketResponse> ticketResponses = new ArrayList<>();

        tickets.forEach(ticket -> {
            ticketResponses.add(TicketResponse.of(ticket));
        });
        return ticketResponses;
    }

    @Override
    public Ticket updateTicket(TicketRequest ticketRequest) {
        Ticket ticket = new Ticket();
        ticket.setId(ticketRequest.getId());
        ticket.setUserId(ticketRequest.getUserId());
        ticket.setPrfid(ticketRequest.getPrfid());
        ticket.setFcltynm(ticketRequest.getFcltynm());
        ticket.setPrfnm(ticketRequest.getPrfnm());
        ticket.setScore(ticketRequest.getScore());
        ticket.setComment(ticketRequest.getComment());

        this.ticketRepository.save(ticket);

        return ticket;
    }

    @Override
    public void deleteTicket(Long Id) {
        Optional<Ticket> ticketOptional = Optional.ofNullable(this.ticketRepository.getOne(Id));

        if(!ticketOptional.isPresent()){
            throw new TicketNotFoundException("존재하지 않는 티켓입니다.");
        }else {
            Ticket ticket = ticketOptional.get();
            this.ticketRepository.delete(ticket);
        }
    }
}
