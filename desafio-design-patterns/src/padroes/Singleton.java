package padroes;

public class Singleton {

    // -- A própria classe armazena a única instância (em modo private e static).
    private static Singleton instancia;

    // -- O construtor é privado, impedindo que alguém use "new Singleton()".
    private Singleton() {
        System.out.println("Instância do Singleton foi criada!");
    }

    // -- O método público (e static) que dá acesso à instância.
    public static Singleton getInstance() {
        // -- Lógica "Lazy Initialization": só cria se não existir.
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    // -- Métodos de exemplo.
    public void mostrarMensagem() {
        System.out.println("Olá, eu sou uma instância Singleton! Meu hashcode é: " + this.hashCode());
    }
}