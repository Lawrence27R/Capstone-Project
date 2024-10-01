package com.aurionpro.capstone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.capstone.entity.Bank;
import com.aurionpro.capstone.repo.BankRepository;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

    @Override
    public Bank createBank(Bank bank) {
        return bankRepository.save(bank);
    }

    @Override
    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    @Override
    public Optional<Bank> getBankById(int bankId) {
        return bankRepository.findById(bankId);
    }

    @Override
    public Bank updateBank(int bankId, Bank bankDetails) {
        Bank bank = bankRepository.findById(bankId)
                .orElseThrow(() -> new RuntimeException("Bank not found with id: " + bankId));
        bank.setBankName(bankDetails.getBankName());
        bank.setIfscNo(bankDetails.getIfscNo());
        return bankRepository.save(bank);
    }

    @Override
    public void deleteBank(int bankId) {
        Bank bank = bankRepository.findById(bankId)
                .orElseThrow(() -> new RuntimeException("Bank not found with id: " + bankId));
        bankRepository.delete(bank);
    }
}
