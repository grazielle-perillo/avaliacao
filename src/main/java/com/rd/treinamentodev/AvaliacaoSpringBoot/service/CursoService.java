package com.rd.treinamentodev.AvaliacaoSpringBoot.service;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CursoService {

    @Autowired
    CursoRepository repository;

    @Transactional
    public String cadastrarCurso(CursoDTO curso){
        CursoEntity cursoEntity = new CursoEntity();
        cursoEntity.setIdCurso(curso.getIdCurso());
        cursoEntity.setNomeCurso(curso.getNomeCurso());
        cursoEntity.setNrCargaHoraria(curso.getNrCargaHoraria());
        repository.save(cursoEntity);
        System.out.println(curso.getIdCurso() + " . " + curso.getNomeCurso() + " . " +curso.getNrCargaHoraria());
        return "Curso cadastrado com sucesso";
    }
}
