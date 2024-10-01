package com.aurionpro.capstone.service;

import com.aurionpro.capstone.entity.Beneficiary;
import com.aurionpro.capstone.repo.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {

	@Autowired
	private BeneficiaryRepository beneficiaryRepository;

	@Override
	public Page<Beneficiary> getAllBeneficiaries(Pageable pageable) {
		return beneficiaryRepository.findAll(pageable);
	}

	@Override
	public Optional<Beneficiary> getBeneficiaryById(Integer beneficiaryId) {
		return beneficiaryRepository.findById(beneficiaryId);
	}

	@Override
	public Beneficiary createBeneficiary(Beneficiary beneficiary) {
		return beneficiaryRepository.save(beneficiary);
	}

	@Override
	public Beneficiary updateBeneficiary(Integer beneficiaryId, Beneficiary beneficiary) {
		Optional<Beneficiary> existingBeneficiary = beneficiaryRepository.findById(beneficiaryId);
		if (existingBeneficiary.isPresent()) {
			Beneficiary updatedBeneficiary = existingBeneficiary.get();
			updatedBeneficiary.setBeneficiaryName(beneficiary.getBeneficiaryName());
			updatedBeneficiary.setBeneficiaryAccountNumber(beneficiary.getBeneficiaryAccountNumber());
			updatedBeneficiary.setBeneficiaryIfsc(beneficiary.getBeneficiaryIfsc());
			return beneficiaryRepository.save(updatedBeneficiary);
		} else {
			throw new RuntimeException("Beneficiary with id " + beneficiaryId + " not found");
		}
	}

	@Override
	public void deleteBeneficiary(Integer beneficiaryId) {
		if (beneficiaryRepository.existsById(beneficiaryId)) {
			beneficiaryRepository.deleteById(beneficiaryId);
		} else {
			throw new RuntimeException("Beneficiary with id " + beneficiaryId + " not found");
		}
	}
}
