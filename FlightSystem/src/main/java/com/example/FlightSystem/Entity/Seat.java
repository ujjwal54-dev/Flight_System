package com.example.FlightSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private Long id;

    @Column(name = "seat_number")
    private String seatNumber;

    @Column(name = "seat_class")
    private String seatClass;

@ManyToOne( fetch = FetchType.LAZY)
@JoinColumn(name = "Airport_id")
private Aircraft aircraft;


    @OneToMany(
            mappedBy = "seat",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Flight_Seats> flightSeats = new ArrayList<>();
}
