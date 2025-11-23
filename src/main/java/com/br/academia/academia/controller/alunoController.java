package com.br.academia.academia.controller;

import com.br.academia.academia.model.Aluno;
import com.br.academia.academia.repository.AlunoRepository;
import com.br.academia.academia.service.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/Aluno")
public class alunoController {
    private final AlunoRepository alunoRepository;

    public alunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public void detalhes(@PathVariable("id") String id){
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return alunoRepository.findById(id).orElse(null);
    }
}
