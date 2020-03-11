package com.otobusbiletibackend.otobusbiletibackend.entity;

import lombok.*;

import javax.persistence.*;
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
    @Column
    private Date buyingDate;

    @Column
    private Date buyingTime;
    @Column
    private String ticketStatus;

}
