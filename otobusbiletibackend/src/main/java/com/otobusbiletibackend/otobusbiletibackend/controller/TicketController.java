package com.otobusbiletibackend.otobusbiletibackend.controller;

import com.otobusbiletibackend.otobusbiletibackend.services.TicketService;
import com.otobusbiletibackend.otobusbiletibackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class TicketController {
    @Autowired
    private TicketService ticketService;
}
