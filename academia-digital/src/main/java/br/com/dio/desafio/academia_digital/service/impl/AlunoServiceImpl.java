package br.com.dio.desafio.academia_digital.service.impl;

import br.com.dio.desafio.academia_digital.models.view.AlunoSummaryView;
import br.com.dio.desafio.academia_digital.models.view.AlunoView;
import br.com.dio.desafio.academia_digital.models.view.AvaliacaoFisicaView;
import br.com.dio.desafio.academia_digital.models.Aluno;
import br.com.dio.desafio.academia_digital.models.form.AlunoForm;
import br.com.dio.desafio.academia_digital.repository.AlunoRepository;
import br.com.dio.desafio.academia_digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public AlunoView get(Long id) {
        Aluno aluno = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

            List<AvaliacaoFisicaView> avaliacoesView = aluno.getAvaliacoes().stream()
                .map(avaliacao -> new AvaliacaoFisicaView(
                        avaliacao.getDataDaAvaliacao(),
                        avaliacao.getPeso(),
                        avaliacao.getAltura()
                )).collect(Collectors.toList());

            return new AlunoView(
                aluno.getId(),
                aluno.getNome(),
                aluno.getCpf(),
                aluno.getBairro(),
                aluno.getDataDeNascimento(),
                avaliacoesView
        );
    }

    @Override
    public List<AlunoSummaryView> getAll() {
        List<Aluno> alunos = repository.findAll();

        return alunos.stream()
                .map(aluno -> new AlunoSummaryView(
                        aluno.getId(),
                        aluno.getNome(),
                        aluno.getCpf(),
                        aluno.getBairro()
                )).collect(Collectors.toList());
    }
}