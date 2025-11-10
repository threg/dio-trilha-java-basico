package br.com.dio.desafio.academia_digital.controller;

import br.com.dio.desafio.academia_digital.models.Matricula;
import br.com.dio.desafio.academia_digital.models.form.MatriculaForm;
import br.com.dio.desafio.academia_digital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private IMatriculaService service;

    @PostMapping
    public Matricula create(@RequestBody MatriculaForm form) {
        return service.create(form);
    }
}