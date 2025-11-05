import iphone.iPhone;

public class App {

    public class Main {
        public static void main(String[] args) {
            iPhone meuIphone = new iPhone();

            // -- Reprodutor Musical.
            meuIphone.selecionarMusica("Imagine - John Lennon");
            meuIphone.tocar();
            meuIphone.pausar();

            // -- Aparelho Telefônico.
            meuIphone.ligar("(11) 99999-9999");
            meuIphone.atender();
            meuIphone.iniciarCorreioVoz();

            // -- Navegador de Internet.
            meuIphone.exibirPagina("www.google.com");
            meuIphone.adicionarNovaAba();
            meuIphone.atualizarPagina();
        }
    }
}
