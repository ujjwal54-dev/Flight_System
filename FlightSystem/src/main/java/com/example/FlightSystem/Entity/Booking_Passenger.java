package com.example.FlightSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Booking_Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
            @JoinColumn(name = "Booking_Id")
    Booking  booking;
    @ManyToOne
            @JoinColumn(name = "Passenger_ID")
    Passenger passenger;
    @OneToOne
            @JoinColumn(name = "Seat_ID")
    Flight_Seats seats;


}
