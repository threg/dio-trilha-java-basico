package br.com.dio.desafio.academia_digital.service.impl;

import br.com.dio.desafio.academia_digital.models.Aluno;
import br.com.dio.desafio.academia_digital.models.Matricula;
import br.com.dio.desafio.academia_digital.models.form.MatriculaForm;
import br.com.dio.desafio.academia_digital.repository.AlunoRepository;
import br.com.dio.desafio.academia_digital.repository.MatriculaRepository;
import br.com.dio.desafio.academia_digital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();

        Aluno aluno = alunoRepository.findById(form.getAlunoId())
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com id: " + form.getAlunoId()));

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }
}