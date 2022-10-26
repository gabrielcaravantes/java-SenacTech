package javaSenacTech;

import java.util.Scanner;
 
public class Operacoes {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
  
  double n1, n2, subtracao, divisao, multiplicacao;;
  
  System.out.println ("Digite o primeiro numero");
  n1 = input.nextDouble();
  System.out.println ("Digite o segundo numero");
  n2 = input.nextDouble();
  
  subtracao = (n1 - n2);
  divisao = (n1 / n2);
  multiplicacao = (n1 * n2);
  
  System.out.println("A subtração é dos numeros é " + subtracao);
  System.out.println("A divisão é dos numeros é " + divisao);
  System.out.println("A multiplicação é dos numeros é " + multiplicacao);
        
  }
}
