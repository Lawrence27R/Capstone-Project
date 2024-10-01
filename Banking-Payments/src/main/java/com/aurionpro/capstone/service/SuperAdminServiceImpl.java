package com.aurionpro.capstone.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.capstone.entity.SuperAdmin;
import com.aurionpro.capstone.repo.SuperAdminRepository;

@Service
public class SuperAdminServiceImpl implements SuperAdminService {

    @Autowired
    private SuperAdminRepository superAdminRepository;

    @Override
    public Optional<SuperAdmin> findByUsername(String username) {
        return Optional.ofNullable(superAdminRepository.findByUsername(username));
    }
}
