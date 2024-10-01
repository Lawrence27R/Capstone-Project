package com.aurionpro.capstone.repo;
import com.aurionpro.capstone.entity.Beneficiary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Integer> {
    Page<Beneficiary> findAll(Pageable pageable);
}

