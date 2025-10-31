# Projeto: Simulação de Processo Seletivo via Terminal

Este projeto é a implementação de um desafio do bootcamp da **Digital Innovation One (DIO)**, focado em praticar os fundamentos da linguagem Java, com ênfase em estruturas de controle de fluxo e manipulação de arrays.

## 📝 Descrição

O objetivo foi criar um programa em Java que simula diversas etapas de um processo seletivo fictício. O programa executa lógicas para analisar salários, selecionar candidatos de uma lista e simular tentativas de contato, exibindo todos os resultados no console.

### Funcionalidades Implementadas:

* **Análise de Candidatos:** Lógica condicional (`if-else`) para classificar um candidato com base em sua pretensão salarial em relação ao salário base.
* **Seleção de Candidatos:** Um loop (`while`) que itera sobre uma lista de candidatos, selecionando até 5 que atendam ao critério de pretensão salarial (usando `ThreadLocalRandom` para simular valores).
* **Impressão de Selecionados:** Demonstração de iteração em arrays usando tanto o `for` tradicional (baseado em índice) quanto o `for-each`.
* **Tentativa de Contato:** Simulação de uma ligação telefônica, onde o sistema tenta contato até 3 vezes (usando `do-while` e `Random`).

## 🚀 Tecnologias Utilizadas

* **Java**: Linguagem principal do projeto.
* **Classes Utilitárias**: `java.util.Random` e `java.util.concurrent.ThreadLocalRandom` para geração de dados aleatórios.
* **IDE**: (Mencione a IDE que você usou, ex: Eclipse, IntelliJ ou VS Code).

## 📋 Pré-requisitos

Para executar este projeto localmente, você precisará de:

* **Java Development Kit (JDK)** (versão 8 ou superior).
* Uma IDE de sua preferência (VS Code, Eclipse, IntelliJ, etc.) ou um compilador Java via linha de comando.
* Conhecimentos básicos de Lógica de Programação e Controle de Fluxo (loops, condicionais).

## 🏃 Como Executar o Projeto

1.  Clone o repositório (se ainda não o fez):
    ```bash
    git clone [https://github.com/threg/dio-trilha-java-basico.git](https://github.com/threg/dio-trilha-java-basico.git)
    ```

2.  Navegue até o diretório específico deste projeto:
    ```bash
    cd dio-trilha-java-basico/processo-seletivo
    ```

3.  Compile o arquivo Java: (Assumindo que `ProcessoSeletivo.java` está na raiz desta pasta. Se estiver em `src`, ajuste o comando para `javac src/ProcessoSeletivo.java`).
    ```bash
    javac ProcessoSeletivo.java
    ```

4.  Execute o programa: (Se usou `src` na compilação, execute com `java -cp src ProcessoSeletivo`).
    ```bash
    java ProcessoSeletivo
    ```

5.  Observe a saída no terminal: O programa executará a simulação de tentativa de contato.

> **Importante:** O método `main` do código fornecido executa apenas a funcionalidade `entrandoEmContato()`. Para testar os outros métodos (`selecaoCandidatos`, `analisarCandidato`, `imprimirSelecionados`), você precisará descomentar ou adicionar as chamadas para eles dentro do método `main` e recompilar.

## 🎓 Sobre o Desafio (DIO)

Este projeto foi desenvolvido como parte do desafio "Desafio de Controle de Fluxo". O objetivo era aplicar os conhecimentos adquiridos sobre:

* Sintaxe básica do Java.
* Uso de estruturas de controle (if-else, switch-case).
* Uso de estruturas de repetição (for, while, do-while).
* Manipulação de arrays.
* Uso de classes de utilidade para geração de números aleatórios.
