package com.aurionpro.capstone.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "documents")
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "documentId")
    private int documentId;
    
    @NotBlank(message = "Document link is mandatory")
    @Pattern(regexp = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$", message = "Invalid document link format")
    @Column(name = "documentLink")
    private String documentLink;
    
    @NotBlank(message = "Document name is mandatory")
    @Size(min = 2, max = 100, message = "Document name must be between 2 and 100 characters.")
    @Column(name = "documentName")
    private String documentName;

    // Many documents belong to one client
    @ManyToOne
    @JoinColumn(name = "registrationNumber", nullable = false)
    private Client client;
}
