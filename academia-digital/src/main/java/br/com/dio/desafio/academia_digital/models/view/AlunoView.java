package br.com.dio.desafio.academia_digital.models.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoView {

    private Long id;
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataDeNascimento;
    private List<AvaliacaoFisicaView> avaliacoes;
}
