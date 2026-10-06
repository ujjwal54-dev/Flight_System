package com.example.FlightSystem.Repository;

import com.example.FlightSystem.Entity.Aircraft;
import com.example.FlightSystem.Entity.Flight;
import com.example.FlightSystem.Entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AircraftRepository extends JpaRepository<Aircraft, Integer> {
   Flight findByFlightAndRegistrationNumber(String flight,String registrationNumber);
   Optional<Seat> findBySeatsAndCapacity(String Available);
   Optional<Flight> findByregistartionNumber(String id);
   Aircraft findByModelAndcapacity(String model,String capacity);




}
