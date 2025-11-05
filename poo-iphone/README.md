# Projeto: Componente iPhone (POO)

Este projeto é a implementação de um desafio do bootcamp da [Digital Innovation One (DIO)](https://www.dio.me/), focado em praticar os fundamentos da linguagem Java e Programação Orientada a Objetos (POO), especialmente o conceito de Interfaces.

## 📝 Descrição

O objetivo foi modelar e implementar em Java o componente iPhone (baseado no lançamento de 2007), que deve assumir três papéis distintos: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

**Funcionalidades Implementadas:**
* **Reprodutor Musical:** Métodos para `tocar`, `pausar` e `selecionarMusica`.
* **Aparelho Telefônico:** Métodos para `ligar`, `atender` e `iniciarCorreioVoz`.
* **Navegador Internet:** Métodos para `exibirPagina`, `adicionarNovaAba` e `atualizarPagina`.
* **Classe iPhone:** Implementação concreta que unifica as três interfaces acima.

## 🚀 Tecnologias Utilizadas

* **Java**: Linguagem principal do projeto.
* **IDE**: VS Code.
* **UML**: Para modelagem das classes e interfaces.

## 📋 Pré-requisitos

Para executar este projeto localmente, você precisará de:
* [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (versão 8 ou superior).
* Uma IDE de sua preferência (VS Code, Eclipse, IntelliJ, etc.) ou um compilador Java via linha de comando.
* Conhecimentos básicos de POO (Classes, Objetos e Interfaces).

## 🏃 Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/threg/dio-trilha-java-basico.git](https://github.com/threg/dio-trilha-java-basico.git)
    ```

2.  **Navegue até o diretório do projeto:**
    (Ajuste `NomeDaPastaDoDesafio` para o nome que você deu à pasta deste projeto específico).
    ```bash
    cd dio-trilha-java-basico/NomeDaPastaDoDesafio
    ```

3.  **Compile os arquivos Java:**
    (Este comando compila todos os arquivos dentro de `src` e seus subpacotes, gerando os binários na pasta `bin`).
    ```bash
    javac -d bin src/App.java src/iphone/*.java
    ```

4.  **Execute o programa:**
    (Executa a classe principal `App` usando os binários compilados).
    ```bash
    java -cp bin App
    ```

5.  **Verifique a saída no terminal:**
    O programa exibirá as mensagens de log correspondentes a cada ação executada pelo iPhone simulado.

## 🎓 Sobre o Desafio (DIO)

Este projeto foi desenvolvido como parte do desafio "Modelagem e Diagramação de um Componente iPhone". O objetivo era aplicar os conhecimentos adquiridos sobre:
* Pilares da POO (Abstração e Encapsulamento).
* Criação e implementação de **Interfaces** Java.
* Modelagem de software utilizando diagramas UML.
