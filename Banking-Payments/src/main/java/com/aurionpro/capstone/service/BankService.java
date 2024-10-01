package com.aurionpro.capstone.service;

import com.aurionpro.capstone.entity.Bank;

import java.util.List;
import java.util.Optional;

public interface BankService {
    
    // Create a new bank
    Bank createBank(Bank bank);
    
    // Get all banks
    List<Bank> getAllBanks();
    
    // Get a bank by ID
    Optional<Bank> getBankById(int bankId);
    
    // Update a bank
    Bank updateBank(int bankId, Bank bankDetails);
    
    // Delete a bank
    void deleteBank(int bankId);
}
