package com.otobusbiletibackend.otobusbiletibackend.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Booking {

    private String departureDate;

    private String returnDate;

    private int numOfSeats;

    private List<String> passenger;

    private double price;
}
