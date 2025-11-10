package br.com.dio.desafio.academia_digital.models.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoSummaryView {
    
    private Long id;
    private String nome;
    private String cpf;
    private String bairro;
}