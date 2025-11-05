# Projeto: Banco Digital com Java e POO

Este projeto é a implementação de um desafio do bootcamp da [Digital Innovation One (DIO)](https://www.dio.me/), focado em reforçar os conhecimentos em **Programação Orientada a Objetos (POO)** em Java.

## 📝 Descrição

O objetivo foi replicar a estrutura básica de um banco digital, aplicando na prática os quatro pilares fundamentais da orientação a objetos: Abstração, Encapsulamento, Herança e Polimorfismo. O projeto permite a criação de clientes, contas correntes e poupança, além de realizar operações bancárias entre elas.

**Funcionalidades Implementadas:**
* **Abstração:** Interface `IConta` definindo o contrato de operações essenciais (sacar, depositar, transferir).
* **Herança & Polimorfismo:** Classe abstrata `Conta` servindo de base para as classes concretas `ContaCorrente` e `ContaPoupanca`.
* **Operações Bancárias:** Depósitos, saques e transferências entre contas diferentes.
* **Impressão de Extrato:** Exibição detalhada das informações da conta e saldo atual.

## 🚀 Tecnologias Utilizadas

* **Java**: Linguagem principal do projeto.
* **IDE**: VS Code.

## 📋 Pré-requisitos

Para executar este projeto localmente, você precisará de:
* [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (versão 8 ou superior).
* Uma IDE de sua preferência (VS Code, Eclipse, IntelliJ, etc.) ou um compilador Java via linha de comando.
* Conhecimentos básicos de POO (Classes, Objetos, Herança e Interfaces).

## 🏃 Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/threg/dio-trilha-java-basico.git](https://github.com/threg/dio-trilha-java-basico.git)
    ```

2.  **Navegue até o diretório do projeto:**
    (Ajuste `desafio-banco-digital` caso tenha nomeado a pasta de forma diferente).
    ```bash
    cd dio-trilha-java-basico/desafio-banco-digital
    ```

3.  **Compile os arquivos Java:**
    (Compilando todos os arquivos do pacote `banco` e a classe principal `App`, direcionando os binários para a pasta `bin`).
    ```bash
    javac -d bin src/App.java src/banco/*.java
    ```

4.  **Execute o programa:**
    (Executando a classe principal a partir da pasta de binários).
    ```bash
    java -cp bin App
    ```

5.  **Verifique a saída no terminal:**
    O programa executará as operações simuladas no arquivo `App.java` e exibirá os extratos das contas no console.

## 🎓 Sobre o Desafio (DIO)

Este projeto foi desenvolvido como parte do desafio "Criando um Banco Digital com Java e Orientação a Objetos". O objetivo era reproduzir e entender a aplicação prática dos pilares da POO:
* **Encapsulamento**: Protegendo o acesso direto ao saldo das contas.
* **Herança**: Reutilizando código da classe mãe `Conta`.
* **Polimorfismo**: Tratando contas correntes e poupança de forma genérica quando necessário.
* **Abstração**: Focando nas ações essenciais que uma conta deve realizar através de interfaces.