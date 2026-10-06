package com.example.FlightSystem.Repository;

import com.example.FlightSystem.Entity.Booking;
import com.example.FlightSystem.Entity.Flight_Seats;
import com.example.FlightSystem.Entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.FlightSystem.Entity.Booking_Passenger;

public interface BookingPassengerRepository extends JpaRepository<Booking_Passenger, Long> {
    Booking findByBooking_Id();
    Passenger findByPassenger_Id();
    Flight_Seats findByFlight_Seats_Id();

}
