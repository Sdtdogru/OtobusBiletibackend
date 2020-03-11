package com.otobusbiletibackend.otobusbiletibackend.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Journey")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Journey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "startLocation",length = 100)
    private String startLocation;

    @Column(name = "finishLocation",length = 100)
    private String finishLocation;

    @Column(name = "startDate",length = 100)
    @Temporal(TemporalType.TIMESTAMP)//hem saat hem tarih
    private Date startDate;


    @Column(name = "ticketPrice",length = 100)
    private Double  ticketPrice;

//    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = BusDetail.class)//cok otobus cok sefer iliskisi
//    @JoinColumn(name = "b_id")
//    private BusDetail b_id;




}
