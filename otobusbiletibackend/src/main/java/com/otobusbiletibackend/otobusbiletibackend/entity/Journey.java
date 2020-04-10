package com.otobusbiletibackend.otobusbiletibackend.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Journey")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Journey  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "startLocation", length = 100)
    private String startLocation;


    @Column(name = "finishLocation", length = 100)
    private String finishLocation;

    @Column
    private String  startDate;

    @Column
    private String startTime;

    @Column
    private int capacity;

    @Column(name = "ticketPrice")
    private Double ticketPrice;
    @Column
    private String plaque;
    @Column
    private String driverName;



 /*   @ManyToMany(fetch = FetchType.LAZY, targetEntity = BusDetail.class)//cok otobus cok sefer iliskisi
    @JoinColumn(name = "b_id")
    private List<String> b_id;
*/


}
