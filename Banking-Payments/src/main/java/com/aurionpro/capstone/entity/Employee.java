package com.aurionpro.capstone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "employees")
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Employee {

    @Id
    @Column(name = "id")
    private int id;

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
    private Long acountnumber;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandatory")
    private String email;
}
