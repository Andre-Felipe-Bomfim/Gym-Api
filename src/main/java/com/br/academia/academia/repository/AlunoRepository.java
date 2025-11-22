package com.br.academia.academia.repository;

import com.br.academia.academia.model.Aluno;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, Id> {
    List<Aluno> findByNome(String name);
    List<Aluno> findByDataDeNascimento(String dataDeNascimento);
    List<Aluno> findByCPF(String cpf);

    Optional<Aluno> findByNameAndDataNascimentoAndCPF(String name, LocalDate dataDeNascimento, String cpf);
}
