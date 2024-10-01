package com.aurionpro.capstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import com.aurionpro.capstone.dto.ClientDto;
import com.aurionpro.capstone.repo.ClientRepository;

public class ClientServiceImpl implements ClientService{

 @Autowired
 private ClientRepository clientRepo;
 

 
 @Override
 public Page<ClientDto> getAllClients(int pageNumber, int pageSize) {
  // TODO Auto-generated method stub
  return null;
 }

 @Override
 public ClientDto addClient(ClientDto clientDto) {
  // TODO Auto-generated method stub
  return null;
 }

 @Override
 public ClientDto updateClient(ClientDto clientDto) {
  // TODO Auto-generated method stub
  return null;
 }

 @Override
 public ClientDto getClientById(int registrationNumber) {
  // TODO Auto-generated method stub
  return null;
 }

}