package br.com.dio.desafio.academia_digital.controller;

import br.com.dio.desafio.academia_digital.models.Aluno;
import br.com.dio.desafio.academia_digital.models.view.AlunoSummaryView;
import br.com.dio.desafio.academia_digital.models.view.AlunoView;
import br.com.dio.desafio.academia_digital.models.form.AlunoForm; 
import br.com.dio.desafio.academia_digital.service.IAlunoService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private IAlunoService service;

    /**
     * Endpoint para CRIAR um novo aluno.
     * Mapeado para a URL: POST /alunos
     */
    @PostMapping
    public Aluno create(@RequestBody AlunoForm form) {
        return service.create(form);
    }

    /**
     * Endpoint para LISTAR TODOS os alunos.
     * Mapeado para a URL: GET /alunos
     */

    @GetMapping
    public List<AlunoSummaryView> getAll() {
        return service.getAll();
    }

    // Você pode adicionar este novo endpoint para buscar por ID
    /**
     * Endpoint para BUSCAR um aluno por ID.
     * Mapeado para a URL: GET /alunos/1 (onde 1 é o ID)
     */

    @GetMapping("/{id}")
    public AlunoView get(@PathVariable Long id) {
        return service.get(id);
    }
}