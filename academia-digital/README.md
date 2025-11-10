# Desafio de Projeto: API RESTful com Spring Data JPA

Este projeto é a implementação de um desafio do bootcamp da **Digital Innovation One (DIO)**, focado em **Mapeamento Objeto-Relacional (ORM)** com **Spring Data JPA**.

## 📝 Descrição

O objetivo foi construir uma **API RESTful** para o domínio de uma academia de ginástica, aplicando os conceitos de arquitetura em 3 camadas (Controller, Service, Repository) e o padrão DTO (Data Transfer Object) para Form/View.

O projeto demonstra o uso do Spring Boot para gerenciar dependências, criar endpoints e persistir dados em um banco de dados relacional.

As entidades modeladas foram:
* `Aluno`: Representa o cliente da academia.
* `Matricula`: Representa a inscrição do aluno (`@OneToOne`).
* `AvaliacaoFisica`: Representa as avaliações físicas de um aluno (`@OneToMany`).

## 🚀 Tecnologias Utilizadas

* **Java (JDK 21)**
* **Spring Boot**: Framework principal para a aplicação.
* **Spring Web**: Para a criação de controladores e endpoints RESTful (`@RestController`).
* **Spring Data JPA**: Para o Mapeamento Objeto-Relacional (ORM) e persistência de dados (`@Entity`, `JpaRepository`).
* **H2 Database**: Um banco de dados em memória, ideal para desenvolvimento e testes.
* **Lombok**: Para reduzir código boilerplate (getters, setters, construtores).
* **Maven**: Gerenciador de dependências e build do projeto.
* **Padrão DTO (Data Transfer Object):** Uso de DTOs para `Form` (entrada) e `View` (saída) para proteger as entidades.

## 🏃 Como Executar o Projeto

1.  Clone o repositório principal (se ainda não o fez).
2.  Navegue até o diretório do projeto:
    ```bash
    cd dio-trilha-java-basico/academia-digital
    ```
3.  Execute o projeto usando o wrapper do Maven (Linux/Mac):
    ```bash
    ./mvnw spring-boot:run
    ```
    Ou (Windows):
    ```bash
    mvnw spring-boot:run
    ```
4.  A API estará disponível em `http://localhost:8080`.
5.  O console do banco de dados H2 estará disponível em `http://localhost:8080/h2-console`
    * **JDBC URL:** `jdbc:h2:mem:testdb`
    * **User:** `sa`
    * **Password:** (em branco)

## Endpoints da API

A API expõe os seguintes endpoints:

### Alunos
* `POST /alunos`: Cria um novo aluno.
  * _Recebe:_ `AlunoForm`
* `GET /alunos`: Lista um sumário de todos os alunos.
  * _Retorna:_ `List<AlunoSummaryView>`
* `GET /alunos/{id}`: Busca o dossiê completo de um aluno por ID (incluindo suas avaliações).
  * _Retorna:_ `AlunoView`

### Avaliações Físicas
* `POST /avaliacoes`: Cria uma nova avaliação física para um aluno.
  * _Recebe:_ `AvaliacaoFisicaForm`

### Matrículas
* `POST /matriculas`: Cria uma nova matrícula para um aluno (relação `@OneToOne`).
  * _Recebe:_ `MatriculaForm`