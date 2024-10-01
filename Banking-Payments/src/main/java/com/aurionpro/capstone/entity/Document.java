package com.aurionpro.capstone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
}
