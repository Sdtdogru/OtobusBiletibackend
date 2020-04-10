package com.otobusbiletibackend.otobusbiletibackend.services;

import com.otobusbiletibackend.otobusbiletibackend.entity.Booking;
import com.otobusbiletibackend.otobusbiletibackend.entity.Ticket;
import com.otobusbiletibackend.otobusbiletibackend.entity.Users;
import com.otobusbiletibackend.otobusbiletibackend.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAllTicket(){
        return ticketRepository.findAll();
    }

    public Boolean purchase(Users users, Booking booking){
        Ticket ticket=new Ticket();
        int seatNo=booking.getNumOfSeats();
        ticket.setSeatNo(seatNo);
        ticket.setPassenger((ArrayList<String>) booking.getPassenger());
        double price=booking.getPrice();
        ticket.setPrice(price);
        ticket.setUser(users);
        return true;
    }

}
