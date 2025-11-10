package br.com.dio.desafio.academia_digital.models.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaView {
    private LocalDateTime dataDaAvaliacao;
    private double peso;
    private double altura;
}