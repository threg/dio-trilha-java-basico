import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Declaração das variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldoConta;

        //Criação do Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta:");
        numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.next();
        
        System.out.println("Por favor, digite o seu Nome completo:");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o Saldo inicial:");
        saldoConta = scanner.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldoConta);
        
        // 2. Fechar o scanner no final
        scanner.close(); 
    }
}