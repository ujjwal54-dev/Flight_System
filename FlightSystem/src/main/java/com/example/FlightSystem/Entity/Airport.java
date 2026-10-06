package com.example.FlightSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter @Setter
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Airport_ID")
    private Long id;
    @Column(name = "Airport_Code",nullable = false,unique = true)
    private String Code;
    @Column(name = "Airport_name")
    private String name;
    @Column(name = "Airport_City")
    private String city;
    @Column(name = "Airport_Country")
    private String Country;

}
