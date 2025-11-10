package br.com.dio.desafio.academia_digital.controller;

import br.com.dio.desafio.academia_digital.models.AvaliacaoFisica;
import br.com.dio.desafio.academia_digital.models.form.AvaliacaoFisicaForm;
import br.com.dio.desafio.academia_digital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private IAvaliacaoFisicaService service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }
}