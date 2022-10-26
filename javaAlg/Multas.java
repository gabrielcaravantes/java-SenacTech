package javaSenacTech;

import java.util.Scanner;

public class Multas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome, carro, temMulta;
        double multa, valor;
        int i;

        System.out.println("Carro: ");
        carro = input.nextLine();
        System.out.println("Proprietário: ");
        nome = input.nextLine();
        System.out.println("Carro possui multas? (S ou N)");
        temMulta = input.nextLine();

        if (temMulta == "N") {
            System.out.println("carro do modelo " + carro + " do proprietário " + nome + " não possuí nenhuma multa");

        } else if (temMulta == "S") {
            System.out.println("Quantas multas? ");
            i = input.nextInt();
            while (i != 0) {
                System.out.println("Valor da multa? ");
                multa = input.nextDouble();
                valor = multa * i;
                System.out.println("carro do modelo " + carro + " do proprietário " + nome + " possui " + temMulta + " multas, no valor de " + valor + " reais.");
            }
        }
    }
}
