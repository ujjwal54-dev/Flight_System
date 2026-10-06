package com.example.FlightSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Getter
@Setter
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Unique_ID", updatable = false, nullable = false, unique = true)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Booking", nullable = false)
    private List<Booking> bookings;

    @Column(name = "Name",nullable = false)
    private String name;

@Column( name = "Email_Id",unique = true, nullable = false)
    private String email;
@Column(name = "Password",nullable = false)
   private  String password;

    private Long PhoneNumber;
    @Column(nullable = false)
    private String role;
    private Time created_At;
    private Time updated_At;
}
