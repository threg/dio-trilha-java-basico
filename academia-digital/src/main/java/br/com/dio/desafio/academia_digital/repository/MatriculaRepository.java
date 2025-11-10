package br.com.dio.desafio.academia_digital.repository;

import br.com.dio.desafio.academia_digital.models.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}