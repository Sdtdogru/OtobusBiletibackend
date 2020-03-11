package com.otobusbiletibackend.otobusbiletibackend.repository;

import com.otobusbiletibackend.otobusbiletibackend.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository< Ticket,Long> {
}
