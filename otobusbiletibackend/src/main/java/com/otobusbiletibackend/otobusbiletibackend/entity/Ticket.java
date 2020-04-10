package com.otobusbiletibackend.otobusbiletibackend.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Ticket")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Users.class)
    @JoinColumn(name = "k_id")
    private List<Users> kullaniciId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ID", nullable=false)
    private Users user;

    @Column
    private Date buyingDate;
    private int seatNo;

    private  Double price;

    @Column
    private Date buyingTime;
    @Column
    private String ticketStatus;
    private ArrayList<String> passenger = new ArrayList<String>();

}
