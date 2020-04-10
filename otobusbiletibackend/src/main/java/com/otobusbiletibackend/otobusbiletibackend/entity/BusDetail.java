package com.otobusbiletibackend.otobusbiletibackend.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Journey")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BusDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plaque",length = 100)
    private String plaque;

    @Column(name = "driverName",length = 100)
    private String driverName;

    @Column(name = "capacity",length = 100)
    private Long capacity;



}
