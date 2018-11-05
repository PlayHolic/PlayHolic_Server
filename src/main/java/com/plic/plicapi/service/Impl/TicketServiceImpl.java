package com.plic.plicapi.service.Impl;

import com.plic.plicapi.controller.exception.TicketNotFoundException;
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
        ticket.setMt20id(ticketRequest.getMt20id());
        ticket.setFcltynm(ticketRequest.getFcltynm());
        ticket.setPrfnm(ticketRequest.getPrfnm());
        ticket.setPrfruntime(ticketRequest.getPrfruntime());
        ticket.setPrfage(ticketRequest.getPrfage());
        ticket.setPrfcast(ticketRequest.getPrfcast());
        ticket.setPrfcrew(ticketRequest.getPrfcrew());

        this.ticketRepository.save(ticket);
    }

    @Override
    public List<TicketResponse> readTickets(String userId) {
        List<Ticket> tickets = this.ticketRepository.findByUserId(userId);
        List<TicketResponse> ticketResponses = new ArrayList<>();

        tickets.forEach(ticket -> ticketResponses.add(TicketResponse.of(ticket)));
        return ticketResponses;
    }

    @Override
    public List<TicketResponse> readUnscoredTickets(String userId) {
        List<Ticket> tickets = this.ticketRepository.findByUserIdAndScoreIsNull(userId);
        List<TicketResponse> ticketResponses = new ArrayList<>();

        tickets.forEach(ticket -> ticketResponses.add(TicketResponse.of(ticket)));
        return ticketResponses;
    }

    @Override
    public List<TicketResponse> readScoredTickets(String userId) {
        List<Ticket> tickets = this.ticketRepository.findByUserIdAndScoreNotNull(userId);
        List<TicketResponse> ticketResponses = new ArrayList<>();

        tickets.forEach(ticket -> ticketResponses.add(TicketResponse.of(ticket)));
        return ticketResponses;
    }

    @Override
    public List<TicketResponse> readNocommentTickets(String userId) {
        List<Ticket> tickets = this.ticketRepository.findByUserIdAndCommentIsNull(userId);
        List<TicketResponse> ticketResponses = new ArrayList<>();

        tickets.forEach(ticket -> ticketResponses.add(TicketResponse.of(ticket)));
        return ticketResponses;
    }

    @Override
    public List<TicketResponse> readCommentTickets(String userId) {
        List<Ticket> tickets = this.ticketRepository.findByUserIdAndCommentNotNull(userId);
        List<TicketResponse> ticketResponses = new ArrayList<>();

        tickets.forEach(ticket -> ticketResponses.add(TicketResponse.of(ticket)));
        return ticketResponses;
    }


    @Override
    public Ticket updateTicket(TicketRequest ticketRequest) {
        Optional<Ticket> ticketOptional = Optional.ofNullable(this.ticketRepository.getOne(ticketRequest.getId()));

        if(!ticketOptional.isPresent()) {
            throw new TicketNotFoundException("존재하지 않는 티켓입니다.");
        } else {
            Ticket ticket = ticketOptional.get();
            ticket.setId(ticketRequest.getId());
            ticket.setUserId(ticketRequest.getUserId());
            ticket.setMt20id(ticketRequest.getMt20id());
            ticket.setFcltynm(ticketRequest.getFcltynm());
            ticket.setPrfnm(ticketRequest.getPrfnm());
            ticket.setPrfruntime(ticketRequest.getPrfruntime());
            ticket.setPrfage(ticketRequest.getPrfage());
            ticket.setPrfcast(ticketRequest.getPrfcast());
            ticket.setPrfcrew(ticketRequest.getPrfcrew());
            ticket.setScore(ticketRequest.getScore());
            ticket.setComment(ticketRequest.getComment());

            this.ticketRepository.save(ticket);

            return ticket;
        }
    }

    @Override
    public void deleteTicket(Long Id) {
        Optional<Ticket> ticketOptional = Optional.ofNullable(this.ticketRepository.getOne(Id));

        if(!ticketOptional.isPresent()) {
            throw new TicketNotFoundException("존재하지 않는 티켓입니다.");
        }else {
            Ticket ticket = ticketOptional.get();
            this.ticketRepository.delete(ticket);
        }
    }

    @Override
    public List<TicketResponse> readTicketHistory(String userId, String mt20id) {
        List<Ticket> tickets = this.ticketRepository.findByUserIdAndMt20id(userId, mt20id);
        List<TicketResponse> ticketResponses = new ArrayList<>();

        tickets.forEach(ticket -> ticketResponses.add(TicketResponse.of(ticket)));

        return ticketResponses;
    }

    @Override
    public void updateTicketComment(Long Id) {
        Optional<Ticket> ticketOptional = Optional.ofNullable(this.ticketRepository.getOne(Id));

        if(!ticketOptional.isPresent()) {
            throw new TicketNotFoundException("존재하지 않는 티켓입니다.");
        } else {
            Ticket ticket = ticketOptional.get();
            ticket.setComment(" ");
            this.ticketRepository.save(ticket);
        }

    }
}
