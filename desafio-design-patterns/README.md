# Desafio de Padrões de Projeto (Design Patterns)

Este projeto é a implementação de um desafio do bootcamp da **Digital Innovation One (DIO)**, focado em explorar os **Padrões de Projeto** em Java.

O objetivo foi implementar um dos padrões "Gang of Four" (GoF) para entender sua estrutura e caso de uso.

## 🚀 Padrão Implementado: Singleton (Criacional)

O padrão escolhido foi o **Singleton**, que pertence à categoria de padrões Criacionais.

### 📝 Descrição

O Singleton garante que uma classe tenha **apenas uma instância** e fornece um ponto de acesso global a essa instância. É útil para objetos que precisam ser únicos em toda a aplicação, como gerenciadores de configuração, pools de conexão ou serviços de logging.

### 🔩 Funcionalidades Implementadas:

* **Construtor Privado:** Impede a instanciação direta da classe via operador `new`.
* **Instância Estática Privada:** A própria classe armazena sua única instância.
* **Método `getInstance()` Público e Estático:** É o único ponto de acesso. Ele verifica se a instância já foi criada ("Lazy Initialization") e a retorna.

### 🏃 Como Executar o Projeto

1.  Clone o repositório principal (se ainda não o fez).
2.  Navegue até o diretório do projeto:
    ```bash
    cd dio-trilha-java-basico/desafio-design-patterns
    ```
3.  Compile os arquivos Java:
    ```bash
    javac -d bin src/Main.java src/padroes/Singleton.java
    ```
4.  Execute o programa:
    ```bash
    java -cp bin Main
    ```
5.  Observe a saída no terminal. O programa demonstrará que, mesmo tentando "criar" três instâncias, todas as variáveis apontam para o mesmo objeto na memória (mesmo hashcode).
