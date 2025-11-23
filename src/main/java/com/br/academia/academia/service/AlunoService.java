package com.br.academia.academia.service;

import com.br.academia.academia.model.Aluno;
import com.br.academia.academia.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AlunoService{
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public void atualizar(Long id, Aluno aluno){
        if (aluno.getUuid() == null){
            throw new IllegalArgumentException("Aluno não encontrado");
        }

        alunoRepository.save(aluno);
    }

    public Optional<Aluno> obterPorId(UUID uuid){
        return alunoRepository.findById(uuid);
    }

    public void deletar(Aluno aluno){
        //TODO criar se o aluno estiver pago mensalidade, anualidade ... não excluir
        alunoRepository.delete(aluno);
    }
}
