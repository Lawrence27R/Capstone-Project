package com.aurionpro.capstone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "clients")
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Client {
	@Id
	@Column(name = "registrationNumber")
	private int registrationNumber;

	@Column(name = "clientName")
	@NotBlank(message = "Client Name is mandatory")
	private String clientName;

	@Column(name = "founderName")
	@NotBlank(message = "Founder Name is mandatory")
	private String founderName;

	@Column(name = "status")
	@NotBlank(message = "Founder Name is mandatory")
	private ClientStatus status;

}
