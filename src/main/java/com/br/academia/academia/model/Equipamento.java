package com.br.academia.academia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "equipamentos")
@Data
public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String marca;
    private String qualidade;
}
