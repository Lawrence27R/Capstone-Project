package com.aurionpro.capstone.service;

import com.aurionpro.capstone.entity.Beneficiary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface BeneficiaryService {

    Page<Beneficiary> getAllBeneficiaries(Pageable pageable);

    Optional<Beneficiary> getBeneficiaryById(Integer beneficiaryId);

    Beneficiary createBeneficiary(Beneficiary beneficiary);

    Beneficiary updateBeneficiary(Integer beneficiaryId, Beneficiary beneficiary);

    void deleteBeneficiary(Integer beneficiaryId);
}

