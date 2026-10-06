package com.example.FlightSystem.Entity;

import jakarta.persistence.*;
;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Getter
@Setter
@Entity
public class Flight_Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String status; //Enum

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_id")
    private Seat seat;
}
