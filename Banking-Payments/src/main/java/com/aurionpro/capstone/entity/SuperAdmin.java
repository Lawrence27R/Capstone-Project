package com.aurionpro.capstone.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "super_admin")
public class SuperAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "superAdminId")
    private Integer superAdminId;

    @NotBlank(message = "Username is required")
    @Column(name = "username", nullable = false)
    private String username;

    @NotBlank(message = "Password is required")
    @Column(name = "password", nullable = false)
    private String password;
    
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is required")
    @Column(name = "email", nullable = false)
    private String email;

}