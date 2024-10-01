package com.aurionpro.capstone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

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
    @Enumerated(EnumType.STRING)  // Assuming ClientStatus is an enum
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
}
