package com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="TB_MODULO")
public class ModuloEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_MODULO")
    private BigInteger idModulo;

    @Column(name="DS_NOME")
    private String dsNome;

    @OneToOne
    @JoinColumn(name = "ID_INSTRUTOR")
    private InstrutorEntity idInstrutor;
}
