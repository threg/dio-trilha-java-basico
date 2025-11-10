package br.com.dio.desafio.academia_digital.service.impl;

import br.com.dio.desafio.academia_digital.models.Aluno;
import br.com.dio.desafio.academia_digital.models.AvaliacaoFisica;
import br.com.dio.desafio.academia_digital.models.form.AvaliacaoFisicaForm;
import br.com.dio.desafio.academia_digital.repository.AlunoRepository;
import br.com.dio.desafio.academia_digital.repository.AvaliacaoFisicaRepository;
import br.com.dio.desafio.academia_digital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacao = new AvaliacaoFisica();

        Aluno aluno = alunoRepository.findById(form.getAlunoId())
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com id: " + form.getAlunoId()));

        avaliacao.setAluno(aluno);
        avaliacao.setPeso(form.getPeso());
        avaliacao.setAltura(form.getAltura());

        return avaliacaoRepository.save(avaliacao);
    }
}