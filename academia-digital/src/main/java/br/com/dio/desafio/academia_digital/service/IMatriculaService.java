package br.com.dio.desafio.academia_digital.service;

import br.com.dio.desafio.academia_digital.models.Matricula;
import br.com.dio.desafio.academia_digital.models.form.MatriculaForm;

public interface IMatriculaService {

    /**
     * Cria uma Matrícula e salva no banco.
     * @param form - formulário referente aos dados para criação.
     * @return Matrícula recém-criada.
     */
    
    Matricula create(MatriculaForm form);
}