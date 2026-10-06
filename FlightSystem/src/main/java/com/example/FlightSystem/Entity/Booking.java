package com.example.FlightSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;

@Entity
@Data
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "Booking_Payment",nullable = false)
    private Payment payment;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "Booking_Ticket",nullable = false)
    private List<Ticket> tickets;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "Flight_id")
    private Flight flight;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "Paasenger_ID")
    private Passenger passenger;



    private String BookingReference;
    private String status;
    private BigDecimal totalAmount;
    private Time CreatedAt;
    private Time UpdatedAt;

}
