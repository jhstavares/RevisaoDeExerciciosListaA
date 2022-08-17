package exercicioDeRevisao.l3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class NotasDoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a primeira nota do aluno");
        double n1 = scanner.nextDouble();

        System.out.println("Informa a segunda nota do aluno");
        double n2 = scanner.nextDouble();


        double media = (n1 + n2) / 2;

        if ((media >= 7) && (media <= 9)) {
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");

        } else if (media == 10) {
            System.out.println("Aprovado com louvor");

        }

    }
}
