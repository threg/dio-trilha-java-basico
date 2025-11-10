package br.com.dio.desafio.academia_digital.service;

import br.com.dio.desafio.academia_digital.models.AvaliacaoFisica;
import br.com.dio.desafio.academia_digital.models.form.AvaliacaoFisicaForm;

public interface IAvaliacaoFisicaService {

    /**
     * Cria uma Avaliação Física e salva no banco.
     * @param form - formulário referente aos dados para criação.
     * @return Avaliação Física recém-criada.
     */
    
    AvaliacaoFisica create(AvaliacaoFisicaForm form);
}