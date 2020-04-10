package com.otobusbiletibackend.otobusbiletibackend.controller;

import com.otobusbiletibackend.otobusbiletibackend.entity.Ticket;
import com.otobusbiletibackend.otobusbiletibackend.services.TicketService;
import com.otobusbiletibackend.otobusbiletibackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {
      @Autowired
    private TicketService ticketService;

    @GetMapping("/ticket")
    public List<Ticket> getAll(){
        return ticketService.getAllTicket();
    }
}
