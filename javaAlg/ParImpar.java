package javaSenacTech;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor;

        System.out.println("Digita um valor para ver se é par ou impar: ");
        valor = input.nextDouble();

        if (valor % 2 == 0) {
            System.out.println("Valor é par");
        } else {
            System.out.println("Valor é impar");
        }
    }
}
