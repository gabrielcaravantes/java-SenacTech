package javaSenacTech;

import java.util.Scanner;

public class Concessionaria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor, ano, desconto, total;
        String nome;

        System.out.println("Concessionária Carango Velho");
        System.out.println();
        System.out.println("Nome do carro ");
        nome = input.nextLine();
        System.out.println("Valor do carro: ");
        valor = input.nextDouble();
        System.out.println("Ano do carro: ");
        ano = input.nextDouble();

        if (ano > 2000) {
            desconto = (valor / 100) * 7;
            total = valor - desconto;
            System.out.println("Nome do carro " + nome);
            System.out.println("seu desconto é de " + desconto + " reais");
            System.out.println("valor da compra " + total);

        } else if (ano <= 2000) {
            desconto = (valor / 100) * 12;
            total = valor - desconto;
            System.out.println("Nome do carro " + nome);
            System.out.println("seu desconto é de " + desconto + " reais");
            System.out.println("valor da compra " + total);

        }

    }
}
