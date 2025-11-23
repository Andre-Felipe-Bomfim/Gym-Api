package com.br.academia.academia.model;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(nullable = false)
    private String name;
    @CPF
    @Column(nullable = false)
    private String cpf;
    private LocalDate dataDeNascimento;
    private LocalDateTime dataContratacao;
}
