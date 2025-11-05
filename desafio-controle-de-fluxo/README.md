# Projeto: Desafio de Controle de Fluxo

Este projeto é a implementação de um desafio do bootcamp da **Digital Innovation One (DIO)**, focado em praticar os fundamentos da linguagem Java, com ênfase em **estruturas de controle de fluxo** e **tratamento de exceções**.

---

## 📝 Descrição

O objetivo foi criar um programa em Java que recebe dois números inteiros via terminal e, em seguida, executa uma lógica de contagem. O programa valida se o segundo número é maior que o primeiro; caso contrário, lança uma exceção personalizada para tratar o erro.

### Funcionalidades Implementadas:

* **Entrada de Dados:** Recebimento de dois números inteiros via terminal (utilizando a classe `Scanner`).
* **Validação de Parâmetros:** Uma lógica condicional (`if`) que verifica se o primeiro parâmetro é maior que o segundo.
* **Exceção Customizada:** Lançamento (`throw`) de uma `ParametrosInvalidosException` caso a validação falhe.
* **Controle de Fluxo:** Um loop (`for`) que itera com base na diferença entre os dois números (`segundoNumero - primeiroNumero`).
* **Tratamento de Erro:** Uso do bloco `try-catch` para capturar a exceção e exibir uma mensagem amigável ao usuário.

## 🚀 Tecnologias Utilizadas

* **Java**: Linguagem principal do projeto.
* **Classes Utilitárias**: `java.util.Scanner` para entrada de dados.
* **IDE**: (Mencione a IDE que você usou, ex: Eclipse, IntelliJ ou VS Code).

## 📋 Pré-requisitos

Para executar este projeto localmente, você precisará de:

* **Java Development Kit (JDK)** (versão 8 ou superior).
* Uma IDE de sua preferência (VS Code, Eclipse, IntelliJ, etc.) ou um compilador Java via linha de comando.
* Conhecimentos básicos de Lógica de Programação, Controle de Fluxo e Tratamento de Exceções.

## 🏃 Como Executar o Projeto

1.  **Clone o repositório (se ainda não o fez):**
    ```bash
    git clone [https://github.com/threg/dio-trilha-java-basico.git](https://github.com/threg/dio-trilha-java-basico.git)
    ```

2.  **Navegue até o diretório específico deste projeto:**
    ```bash
    cd dio-trilha-java-basico/desafio-controle-fluxo 
    ```
    *(Ajuste o nome da pasta se necessário)*

3.  **Compile os arquivos Java:**
    *(Assumindo que os arquivos .java estão na raiz desta pasta. Se estiverem em `src`, ajuste o comando, ex: `javac src/*.java`)*
    ```bash
    javac Contador.java ParametrosInvalidosException.java
    ```

4.  **Execute o programa:**
    *(Se usou `src` na compilação, execute com `java -cp src Contador`)*
    ```bash
    java Contador
    ```

5.  **Siga as instruções no terminal:**
    O programa solicitará que você digite o primeiro e o segundo número.
