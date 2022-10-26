package javaSenacTech;

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args){
      Scanner input = new Scanner (System.in);
  String nome, endereco;
  int idade, telefone;
  
  System.out.println ("Digite seu nome");
  nome = input.nextLine();
  System.out.println("Digite seu endereço");
  endereco = input.nextLine();
  System.out.println("Digite sua idade");
  idade = input.nextInt();
  System.out.println("Digite seu telefone");
  telefone = input.nextInt();
        
  System.out.println("Você foi cadastrado com sucesso");
        
        
}
    
}
