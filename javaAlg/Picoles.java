package javaSenacTech;

import java.util.Scanner;

public class Picoles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int picole, quantidade;
        double valor;

        System.out.println("Picolés Gelados");
        System.out.println();
        System.out.println("Sabores disponíveis");
        System.out.println();
        System.out.println("1- Picole de Uva R$ 1,00");
        System.out.println("2- Picole de Laranja R$ 1,25");
        System.out.println("3- Picole de Milho R$ 1,50");
        System.out.println("Digite o número do picolé desejado: ");
        picole = input.nextInt();

        if (picole == 1) {
            System.out.println("Você escolheu o sabor uva");
            System.out.println();
            System.out.println("Digite a quantidade de picolés de uva: ");
            quantidade = input.nextInt();
            valor = (quantidade * 1.0);
            System.out.println("Você comprou " + quantidade + "picolés de uva");
            System.out.println("O valor da compra foi de R$" + valor);
        } else if (picole == 2) {
            System.out.println("Você escolheu o sabor laranja");
            System.out.println();
            System.out.println("Digite a quantidade de picolés de laranja: ");
            quantidade = input.nextInt();
            valor = (quantidade * 1.25);
            System.out.println("Você comprou " + quantidade + "picolés de laranja");
            System.out.println("O valor da compra foi de R$" + valor);
        } else {
            System.out.println("Você escolheu o sabor milho");
            System.out.println();
            System.out.println("Digite a quantidade de picolés de milho: ");
            quantidade = input.nextInt();
            valor = (quantidade * 1.5);
            System.out.println("Você comprou " + quantidade + "picolés de milho");
            System.out.println("O valor da compra foi de R$" + valor);

        }

    }
}
