package com.aurionpro.capstone.service;

import org.springframework.data.domain.Page;

import com.aurionpro.capstone.dto.ClientDto;

public interface ClientService {
 Page<ClientDto> getAllClients(int pageNumber, int pageSize);

 ClientDto addClient(ClientDto clientDto);

 ClientDto updateClient(ClientDto clientDto);
 
 ClientDto getClientById(int registrationNumber);
}