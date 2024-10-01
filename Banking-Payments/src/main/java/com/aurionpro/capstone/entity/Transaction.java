package com.aurionpro.capstone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @NotNull(message = "Transaction ID is mandatory")
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate employeeid
    @Column(name = "transactionid")
    private Integer transactionid;

    @NotNull(message = "Sender account is mandatory")
    @Min(value = 1, message = "Sender account number must be positive")
    @Column(name = "senderAcct")
    private Integer senderAcct;

    @NotNull(message = "Receiver account is mandatory")
    @Min(value = 1, message = "Receiver account number must be positive")
    @Column(name = "receiverAcct")
    private Integer receiverAcct;

    @NotNull(message = "Amount is mandatory")
    @Positive(message = "Amount must be positive")
    @Column(name = "amount")
    private Double amount;

    @NotNull(message = "Transaction type is mandatory")
    @Column(name = "transaction")
    private TransactionType transaction;
}
