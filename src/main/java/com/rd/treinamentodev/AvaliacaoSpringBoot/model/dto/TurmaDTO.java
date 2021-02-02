package com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class TurmaDTO {

    private CursoEntity curso;

    private Date dtInicio;

    private Date dtFim;

    private List<InstrutorDTO> instrutores;

    private List<AlunoDTO> alunos;
}
