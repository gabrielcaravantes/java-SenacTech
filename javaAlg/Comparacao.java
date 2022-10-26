package javaSenacTech;

import java.util.Scanner;

public class Comparacao {
    public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    
    int x, y;
    
    System.out.println("Digite um valor para X: ");
    x = input.nextInt();
    System.out.println("Digite um valor para Y: ");
    y = input.nextInt();
    
    if(x>y) {
    System.out.println("O valor de X é maior que o valor de Y");
    }
    else if(x<y) {
    System.out.println("O valor de Y é maior que o valor de X");
    }
    else 
        System.out.println("Os valores de X e Y são idênticos");       
       
    }
}
