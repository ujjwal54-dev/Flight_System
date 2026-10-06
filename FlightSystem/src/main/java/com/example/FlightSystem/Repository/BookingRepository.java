package com.example.FlightSystem.Repository;

import com.example.FlightSystem.Entity.Booking;
import com.example.FlightSystem.Entity.Passenger;
import com.example.FlightSystem.Entity.Payment;
import com.example.FlightSystem.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Payment findByBooking_Payment(Long id);
    Optional<Ticket> findByBooking_Ticket(Long id);

}
