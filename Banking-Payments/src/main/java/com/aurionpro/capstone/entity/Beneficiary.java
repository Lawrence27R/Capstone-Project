package com.aurionpro.capstone.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "beneficiaries")
public class Beneficiary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beneficiary_id")
    private Integer beneficiaryId;

    @NotBlank(message = "Beneficiary name is required")
    @Column(name = "beneficiary_name", nullable = false)
    private String beneficiaryName;

    @NotBlank(message = "Beneficiary account number is required")
    @Column(name = "beneficiary_account_number", nullable = false)
    private String beneficiaryAccountNumber;

    @NotBlank(message = "IFSC code is required")
    @Column(name = "beneficiary_ifsc", nullable = false)
    private String beneficiaryIfsc;

    // New beneficiaryAmount field
    @NotNull(message = "Beneficiary amount is required")
    @Positive(message = "Beneficiary amount must be positive")
    @Column(name = "beneficiary_amount", nullable = false)
    private Double beneficiaryAmount;

    // Many beneficiaries belong to one client
    @ManyToOne
    @JoinColumn(name = "registrationNumber", nullable = false)
    private Client client;
}
