package com.example.FlightSystem.Repository;

import com.example.FlightSystem.Entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport,Long> {
  

}
