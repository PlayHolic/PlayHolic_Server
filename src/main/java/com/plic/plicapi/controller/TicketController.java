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
    TicketService ticketService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createTicket (@RequestBody TicketRequest ticketRequest) {
        this.ticketService.createTicket(ticketRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public ResponseEntity<List<TicketResponse>> readTickets (@PathVariable Long userId) {
        List<TicketResponse> ticketResponses = this.ticketService.readTickets(userId);
        return new ResponseEntity<List<TicketResponse>>(ticketResponses, HttpStatus.OK);
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
}
