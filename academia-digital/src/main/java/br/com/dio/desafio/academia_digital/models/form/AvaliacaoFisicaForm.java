package br.com.dio.desafio.academia_digital.models.form;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AvaliacaoFisicaForm {

    private Long alunoId;

    private double peso;

    private double altura;
}