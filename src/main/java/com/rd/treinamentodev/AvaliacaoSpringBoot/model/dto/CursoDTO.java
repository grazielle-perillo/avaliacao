package com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto;

import lombok.Data;

import java.math.BigInteger;

@Data
public class CursoDTO {
    private BigInteger idCurso;
    private String nomeCurso;
    private Integer nrCargaHoraria;
}
