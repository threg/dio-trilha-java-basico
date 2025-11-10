package br.com.dio.desafio.academia_digital.service;

import br.com.dio.desafio.academia_digital.models.view.AlunoSummaryView;
import br.com.dio.desafio.academia_digital.models.view.AlunoView;
import br.com.dio.desafio.academia_digital.models.Aluno;
import br.com.dio.desafio.academia_digital.models.form.AlunoForm;

import java.util.List;

public interface IAlunoService {

    /**
     * Cria um Aluno e salva no banco.
     * @param form - formulário referente aos dados para criação.
     * @return Aluno recém-criado.
     */

    Aluno create(AlunoForm form);

    /**
     * Retorna um Aluno que está no banco.
     * @param id - id do Aluno.
     * @return Aluno.
     */

    AlunoView get(Long id);

    /**
     * Retorna todos os Alunos.
     * @return Lista de Alunos.
     */

    List<AlunoSummaryView> getAll();
}
