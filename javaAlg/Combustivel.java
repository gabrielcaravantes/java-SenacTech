package javaSenacTech;

import java.util.Scanner;

public class Combustivel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, litros;
        double gasolina, alcool, total = 0;

        System.out.println("valor da gasolina E$ ");
        gasolina = input.nextDouble();
        System.out.println("valor do alcool R$ ");
        alcool = input.nextDouble();
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("*****************************************");

        System.out.println("Escolha uma das opções abaixo");

        System.out.println("1 - comprar gasolina");
        System.out.println("2 - comprar alcool");
        System.out.println("3 - sair");
        x = input.nextInt();
        System.out.println("****************************************");
        System.out.println();
        System.out.println("Quantos litros gostaria de comprar?");
        litros = input.nextInt();

        if (x == 1) {
            total = (litros * gasolina);
        } else if (x == 2) {
            total = (litros * alcool);
        } else {
            System.out.println("Você optou em sair!!");
            litros = 0;
        }
        System.out.println("Foram abastecidos " + litros + " litros de combústivel");
        System.out.println("Total a ser pago R$ " + total);

    }
}
