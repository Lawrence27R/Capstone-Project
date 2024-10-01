package com.aurionpro.capstone.service;

import com.aurionpro.capstone.entity.SuperAdmin;

import java.util.Optional;

public interface SuperAdminService {

    // Find SuperAdmin by username
    Optional<SuperAdmin> findByUsername(String username);
}
