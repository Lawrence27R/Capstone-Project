package com.aurionpro.capstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.capstone.entity.SuperAdmin;

public interface SuperAdminRepository extends JpaRepository<SuperAdmin, Integer> {
    // You can add custom query methods if needed
    SuperAdmin findByUsername(String username);
}
