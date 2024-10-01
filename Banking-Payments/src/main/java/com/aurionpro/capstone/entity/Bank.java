package com.aurionpro.capstone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

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
    
    @NotNull(message = "IFSC number is mandatory")
//    @Pattern(regexp = "\\d{11}", message = "IFSC number must be exactly 11 digits.")
    @Column(name = "ifscNo")
    private String ifscNo;

}
