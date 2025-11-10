package br.com.dio.desafio.academia_digital.models.form;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class AlunoForm {

    private String nome;

    private String cpf;

    private String bairro;

    private LocalDate dataDeNascimento;
}