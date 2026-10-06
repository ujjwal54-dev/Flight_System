package com.example.FlightSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Time;

@Entity
@Getter
@Setter
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private BigDecimal amount;
    private String status; //ENUM
    private String paymentReference;
    private Time createdAt;
    private String Payment_Method;//ENUM
}
