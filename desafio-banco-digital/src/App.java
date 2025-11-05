import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        // - Criando um cliente.
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        // -- Criando contas para esse cliente.
        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        // -- Testando operações.
        cc.depositar(100);
        cc.transferir(50, poupanca);

        // -- Imprimindo resultados.
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}