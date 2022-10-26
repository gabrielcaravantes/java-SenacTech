package javaSenacTech;

import java.util.Scanner;

public class mediaNotas {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
  String nome;
  double nota1, nota2, nota3, media;
  
  System.out.println("Digite seu nome: ");
  nome = input.nextLine();
  System.out.println("Digite sua primeira nota: ");
  nota1 = input.nextDouble();
  System.out.println("Digite sua segunda nota: ");
  nota2 = input.nextDouble();
  System.out.println("Digite sua terceira nota: ");
  nota3 = input.nextDouble();
  
  media = (nota1+nota2+nota3)/3;
  
    System.out.println(nome + " sua média é " + media);
  
  
    }
    
}
