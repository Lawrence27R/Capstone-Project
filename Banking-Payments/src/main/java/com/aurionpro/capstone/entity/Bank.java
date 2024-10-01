package com.aurionpro.capstone.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "banks")
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate bankId
    @Column(name = "bankId")
    private int bankId;
    
    @NotBlank(message = "Bank Name is mandatory")
    @Size(min = 2, max = 100, message = "Bank Name must be between 2 and 100 characters.")
    @Column(name = "bankName")
    private String bankName;
    
    @NotBlank(message = "IFSC number is mandatory")
    @Pattern(regexp = "^[A-Z]{4}\\d{7}$", message = "IFSC number must start with 4 alphabets followed by 7 digits.")
    @Column(name = "ifscNo")
    private String ifscNo;

    // One bank has many clients
    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Client> clients;
}
