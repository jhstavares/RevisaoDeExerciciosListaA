package exercicioDeRevisao.l3;

import java.util.Scanner;

public class ComprandoOProdutoDeMenorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Compre o produto de menor valor");


        System.out.println("O valor do primeiro produto � ? : ");
        double pdrt1 = scanner.nextDouble();

        System.out.println("O valor do segundo produto �  ? : ");
        double prdrt2 = scanner.nextDouble();

        System.out.println("O valor do terceiro produto � ? :");
        double prdrt3 = scanner.nextDouble();

        if ((pdrt1 < prdrt2) && (pdrt1 < prdrt3)) {
            System.out.println(" produto de menor valor �: " + pdrt1);

        } else if ((prdrt2 < pdrt1) && (prdrt2 < prdrt3)) {
            System.out.println("O produto de menor valor �: " + prdrt2);
        } else if ((prdrt3 < pdrt1) && (prdrt3 < prdrt2)) {
            System.out.println(" O produto de menor valor �: " + prdrt3);

        } else if ((pdrt1 == prdrt2) && (prdrt2 == prdrt3)) {
            System.out.println("Favor levar os 3 produtos. Pois todos tem o mesmo valor");

        }
    }
}
