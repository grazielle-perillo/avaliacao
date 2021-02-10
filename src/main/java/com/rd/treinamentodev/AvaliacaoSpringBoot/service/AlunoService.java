package com.rd.treinamentodev.AvaliacaoSpringBoot.service;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.AlunoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.ResultData;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.TurmaDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.AlunoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.TurmaEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;


    public ResponseEntity gravar(AlunoDTO alunoDTO) {

        if (alunoRepository.findByCpf(alunoDTO.getCpf()).equals(1)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("CPF já cadastrado.");
        } else {
            AlunoEntity entity = new AlunoEntity();
            entity.setNomeAluno(alunoDTO.getNome());
            entity.setCpf(alunoDTO.getCpf());
            entity = alunoRepository.save(entity);

            ResultData resultData = new ResultData(HttpStatus.CREATED.value(), "Aluno cadastrado com sucesso", entity.getIdAluno());
            return ResponseEntity.status(HttpStatus.CREATED).body(resultData);
        }
    }
}
