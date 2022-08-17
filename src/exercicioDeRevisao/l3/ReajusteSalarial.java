package exercicioDeRevisao.l3;

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu salario: ");

        double salMensal = scanner.nextDouble();
        scanner.close();

        double vintPorCentAum = salMensal * 0.20;
        double quinPorCenAum = salMensal * 0.15;
        double dezPorCenAum = salMensal * 0.10;
        double cinPorCenAum = salMensal * 0.05;

        if (salMensal <= 280) {
            System.out.printf("Salário atual: %.2f $\n", salMensal);
            System.out.println("Aumento de: 20%");
            System.out.printf("O valor do aumento é de: %.2f $\n", vintPorCentAum);
            System.out.printf("Seu novo salário com aumento é de: %.2f $\n", salMensal + vintPorCentAum);


        } else if (salMensal > 280 && salMensal <= 700) {
            System.out.printf("Salario atual:  %.2f $\n", salMensal);
            System.out.println("Aumento de: 15%");
            System.out.printf("O valor do aumento é de: %.2f $:\n", quinPorCenAum);
            System.out.printf("Seu novo salario com aumento é de: %.2f $\n", salMensal + quinPorCenAum);

        } else if (salMensal > 700 && salMensal <= 1500) {
            System.out.printf("Salario atual: %.2f $\n ", salMensal);
            System.out.println("Aumento de: 10%");
            System.out.printf("O valor do aumento é de: %.2f $:\n", dezPorCenAum);
            System.out.printf("Seu novo salario com aumento é de: %.2f $\n", salMensal + dezPorCenAum);

        } else if (salMensal > 1500) {
            System.out.printf("Salario atual: %.2f $\n", +salMensal);
            System.out.println("Aumento de: 5%");
            System.out.printf("O valor do aumento é de: %.2f $:\n", cinPorCenAum);
            System.out.printf("Seu novo salario com reajuste é de: %.2f $\n", salMensal + cinPorCenAum);

        }
    }
}



