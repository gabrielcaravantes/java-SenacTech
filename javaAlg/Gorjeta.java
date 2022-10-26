package javaSenacTech;

import java.util.Scanner;

public class Gorjeta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        double salario, gorjeta;

        System.out.println("Digite o nome do funcionário: ");
        nome = input.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        salario = input.nextDouble();

        gorjeta = (salario * 0.1);

        System.out.println("O funcionário " + nome + ", com o salário de R$" + salario + " recebe uma gorjeta de R$" + gorjeta);

    }
}
