package com.example.FlightSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Entity
@Getter
@Setter
@Data
public class Aircraft {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name= "Aircraft_Id")
    private Long Id;

   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name= "Aircraft_Seat",nullable = false)
    private List<Seat> seats;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Aircraft_Flight",nullable = false)
    private List<Flight> flights;

    private Long id;
    @Column(name = "Aircraft_Registration_Number",unique = true)
    private String registrationNumber;
    @Column(name = "Aircraft_Model")
    private String model;
    @Column(name = "Aircraft_capacity")
    private String capacity;
    private Time created_At;

}
