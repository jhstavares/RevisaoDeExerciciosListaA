package exercicioDeRevisao.l3;

import java.util.Scanner;

public class ImprindoOMaiorNumero {

    public static void main(String[] args) {

        System.out.println("Descobrindo o maior n�mero");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um n�mero");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro n�mero");
        int n2 = scanner.nextInt();


        if (n1 > n2) {
            System.out.println("O n�mero maior �: " + n1);


        } else if (n1 == n2) {
            System.out.println("Os n�meros s�o iguais");

        } else {
            System.out.println("O n�mero maior �: " + n2);
        }

    }
}


