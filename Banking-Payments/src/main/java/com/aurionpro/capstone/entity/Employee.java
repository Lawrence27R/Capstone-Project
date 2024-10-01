package com.aurionpro.capstone.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate employeeId
    @Column(name = "employeeid")
    private int employeeid;

    @Column(name = "firstname")
    @NotBlank(message = "First Name is mandatory")
    private String firstname;

    @Column(name = "lastname")
    @NotBlank(message = "Last Name is mandatory")
    private String lastname;

    @Column(name = "salary")
    @NotNull(message = "Salary is mandatory")
    @Positive(message = "Salary must be positive")
    private Double salary;

    @NotNull(message = "Account number is mandatory")
    private Long accountnumber;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandatory")
    private String email;

    // Many employees belong to one client
    @ManyToOne
    @JoinColumn(name = "client_registrationNumber", nullable = false) // Foreign key column for Client
    private Client client;  // Added relationship to client
}
