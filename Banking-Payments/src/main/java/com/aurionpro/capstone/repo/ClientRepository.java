package com.aurionpro.capstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.capstone.entity.Client;


public interface ClientRepository extends JpaRepository<Client, Integer> {

}
