package com.plic.plicapi.controller;

import com.plic.plicapi.controller.model.request.TicketRequest;
import com.plic.plicapi.controller.model.response.TicketResponse;
import com.plic.plicapi.service.custom.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createTicket (@RequestBody TicketRequest ticketRequest) {
        this.ticketService.createTicket(ticketRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public ResponseEntity<List<TicketResponse>> readTickets (@PathVariable String userId) {
        List<TicketResponse> ticketResponses = this.ticketService.readTickets(userId);
        return new ResponseEntity<>(ticketResponses, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/unscored/{userId}")
    public ResponseEntity<List<TicketResponse>> readUnscoredTickets (@PathVariable String userId) {
        List<TicketResponse> ticketResponses = this.ticketService.readUnscoredTickets(userId);
        return new ResponseEntity<>(ticketResponses, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/scored/{userId}")
    public ResponseEntity<List<TicketResponse>> readScoredTickets (@PathVariable String userId) {
        List<TicketResponse> ticketResponses = this.ticketService.readScoredTickets(userId);
        return new ResponseEntity<>(ticketResponses, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/nocomment/{userId}")
    public ResponseEntity<List<TicketResponse>> readNocommentTickets (@PathVariable String userId) {
        List<TicketResponse> ticketResponses = this.ticketService.readNocommentTickets(userId);
        return new ResponseEntity<>(ticketResponses, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/comment/{userId}")
    public ResponseEntity<List<TicketResponse>> readcommentTickets (@PathVariable String userId) {
        List<TicketResponse> ticketResponses = this.ticketService.readCommentTickets(userId);
        return new ResponseEntity<>(ticketResponses, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity updateTicket (@RequestBody TicketRequest ticketRequest) {
        this.ticketService.updateTicket(ticketRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{Id}")
    public ResponseEntity deleteTicket (@PathVariable Long Id) {
        this.ticketService.deleteTicket(Id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/history/{userId}/{mt20id}")
    public  ResponseEntity<List<TicketResponse>> readTicketHistory (@PathVariable String userId, String mt20id) {
        List<TicketResponse> ticketResponses = this.ticketService.readTicketHistory(userId, mt20id);
        return  new ResponseEntity<>(ticketResponses, HttpStatus.OK);
    }
}
