package com.aurionpro.capstone.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "clients")
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Client {

    @Id
    @Column(name = "registrationNumber")
    @NotNull(message = "Registration number is mandatory")
    private Integer registrationNumber;

    @Column(name = "clientName")
    @NotBlank(message = "Client Name is mandatory")
    private String clientName;

    @Column(name = "status")
    @NotNull(message = "Status is mandatory")
    @Enumerated(EnumType.STRING)
    private ClientStatus status;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotBlank(message = "State is mandatory")
    private String state;

    @NotBlank(message = "City is mandatory")
    private String city;

    @NotNull(message = "Account number is mandatory")
    @Positive(message = "Account number must be positive")
    private Long accountNumber;

    @NotBlank(message = "Username is mandatory")
    private String username;

    @NotBlank(message = "Password is mandatory")
    private String password;

    // Many clients belong to one bank
    @ManyToOne
    @JoinColumn(name = "bankId", nullable = false)
    private Bank bank;

    // One client has many beneficiaries
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Beneficiary> beneficiaries;

    // Many clients belong to one SuperAdmin
    @ManyToOne
    @JoinColumn(name = "superAdminId", nullable = false)
    private SuperAdmin superAdmin;

    // One client has many employees
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employee> employees; // Added relationship to employees
}
