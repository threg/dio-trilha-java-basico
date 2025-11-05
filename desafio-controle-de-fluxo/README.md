# Projeto: Desafio de Controle de Fluxo

Este projeto é a implementação de um desafio do bootcamp da [Digital Innovation One (DIO)](https://www.dio.me/), focado em praticar os fundamentos da linguagem Java, especialmente estruturas de controle de fluxo e tratamento de exceções.

## 📝 Descrição

O objetivo foi criar um programa em Java que recebe dois números inteiros via terminal e executa uma contagem baseada na diferença entre esses números. O sistema deve validar se o segundo número é maior que o primeiro, lançando uma exceção customizada caso contrário.

**Funcionalidades Implementadas:**
* Recebimento de dados via terminal (utilizando a classe `Scanner`).
* Validação condicional (`if`) dos parâmetros de entrada.
* Lançamento de exceção customizada (`ParametrosInvalidosException`).
* Estrutura de repetição (`for`) para realizar a contagem.
* Tratamento de erros com blocos `try-catch`.

## 🚀 Tecnologias Utilizadas

* **Java**: Linguagem principal do projeto.
* **IDE**: VS Code.

## 📋 Pré-requisitos

Para executar este projeto localmente, você precisará de:
* [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (versão 8 ou superior).
* Uma IDE de sua preferência (VS Code, Eclipse, IntelliJ, etc.) ou um compilador Java via linha de comando.
* Conhecimentos básicos de Controle de Fluxo (loops e condicionais) e Exceções.

## 🏃 Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/threg/dio-trilha-java-basico.git](https://github.com/threg/dio-trilha-java-basico.git)
    ```

2.  **Navegue até o diretório do projeto:**
    (Ajuste `desafio-controle-fluxo` para o nome exato da pasta onde você salvou este desafio).
    ```bash
    cd dio-trilha-java-basico/desafio-controle-fluxo
    ```

3.  **Compile os arquivos Java:**
    (Se seus arquivos estiverem dentro de uma pasta `src`, ajuste para `javac src/*.java`).
    ```bash
    javac Contador.java ParametrosInvalidosException.java
    ```

4.  **Execute o programa:**
    (Se compilou usando `src`, talvez precise usar `java -cp src Contador`).
    ```bash
    java Contador
    ```

5.  **Siga as instruções no terminal:**
    O programa solicitará que você digite o primeiro e o segundo número para iniciar a contagem.

## 🎓 Sobre o Desafio (DIO)

Este projeto foi desenvolvido como parte do desafio "Controle de Fluxo". O objetivo era aplicar os conhecimentos adquiridos sobre:
* Estruturas condicionais (`if/else`).
* Estruturas de repetição (`for`, `while`).
* Criação e tratamento de exceções personalizadas em Java.
