import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        entrandoEmContato();
    }

    static void entrandoEmContato() {
        String[] candidatos = { "Ana", "Bia", "Carlos", "Daniel", "Rafaela" };
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso.");
            }
        } while (continuarTentando && tentativasRealizadas <= 3);

        if (atendeu) {
            System.out.println("Número de tentativas até conseguir contato: " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com o candidato após " + tentativasRealizadas + " tentativas.");
        }
    }
    

    // Método de simulação de atendimento telefônico.
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Ana", "Bia", "Carlos", "Daniel", "Rafaela" };
        System.out.println("Imprimindo a lista de candidatos pelo índice do elemento:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato nº " + (i + 1) + ": " + candidatos[i]);
        }
        System.out.println("Forma simplificada de imprimir os candidatos:");
        for(String candidato : candidatos) {
            System.out.println("Candidato selecionado: " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Ana", "Bia", "Carlos", "Daniel", "Rafaela", "Gui", "Rebeca", "Talles", "Luiz", "Thamires" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO RESULTADOS DOS DEMAIS CANDIDATOS.");
        }
    }
}
