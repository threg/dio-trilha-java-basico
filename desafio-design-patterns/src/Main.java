import padroes.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o teste do Singleton...");

        // -- Pega a instância pela primeira vez.
        Singleton singletonUm = Singleton.getInstance();
        singletonUm.mostrarMensagem();

        // -- Tenta pegar a instância novamente.
        Singleton singletonDois = Singleton.getInstance();
        singletonDois.mostrarMensagem();

        // -- Tenta pegar uma terceira vez.
        Singleton singletonTres = Singleton.getInstance();
        singletonTres.mostrarMensagem();

        System.out.println("---");
        System.out.println("As três variáveis apontam para a mesma instância?");
        
        boolean mesmoHash = (singletonUm.hashCode() == singletonDois.hashCode()) && 
                            (singletonDois.hashCode() == singletonTres.hashCode());

        if (mesmoHash) {
            System.out.println("SIM! O padrão Singleton funcionou. Só uma instância foi criada.");
        } else {
            System.out.println("NÃO! O padrão Singleton falhou.");
        }
    }
}