package exercicioDeRevisao.l3;

import java.util.Scanner;

public class ImprindoOMaiorNumero {

    public static void main(String[] args) {

        System.out.println("Descobrindo o maior número");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro número");
        int n2 = scanner.nextInt();


        if (n1 > n2) {
            System.out.println("O número maior é: " + n1);


        } else if (n1 == n2) {
            System.out.println("Os números são iguais");

        } else {
            System.out.println("O número maior é: " + n2);
        }

    }
}


