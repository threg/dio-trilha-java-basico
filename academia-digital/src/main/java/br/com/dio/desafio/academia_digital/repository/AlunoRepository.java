package br.com.dio.desafio.academia_digital.repository;

import br.com.dio.desafio.academia_digital.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}