package com.example.FlightSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Data
@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String flightNumber;

    private Time departureTime;
    private Time ArrivalTime;

    private Time Created_At;
    private Time Updated_At;
    private String status;

    @ManyToOne
    @JoinColumn(name = "source_airport_id")
    private Airport sourceAirport;

    @ManyToOne
    @JoinColumn(name = "destination_airport_id")
    private Airport destinationAirport;

    @ManyToOne
    @JoinColumn(name = "Aircraft_Id")
    private Aircraft aircraft;



    @OneToMany(
            mappedBy = "flight",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Flight_Seats> flightSeats = new ArrayList<>();
}