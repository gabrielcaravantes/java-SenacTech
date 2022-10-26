package javaSenacTech;

import java.util.Scanner;

public class ContagemXateY {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int x, y;
        
        System.out.println("Contagem de onde até onde quiser");
        System.out.print("Digite o valor inicial: ");
        x = input.nextInt();
        System.out.print("Digite o valor final: ");
        y = input.nextInt();
     
        if (x > y){
            while (x >= y){
                System.out.print(" " + x);
                x--;
            }
        } else {
            while(x <= y){
                System.out.println(" " + x);
                x++;
            }
        }
        
        System.out.println("\n");
        }  
    }

