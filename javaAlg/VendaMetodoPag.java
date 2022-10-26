package javaSenacTech;

import javax.swing.JOptionPane;

public class VendaMetodoPag {

    public static void main(String[] args) {

        String escolha1, nome, valor1;
        int escolha;
        double valor, total = 0;

        nome = JOptionPane.showInputDialog("Digite o seu nome");

        valor1 = JOptionPane.showInputDialog("Digite o valor da venda");
        valor = Double.parseDouble(valor1);

        escolha1 = JOptionPane.showInputDialog("Escolha o método de venda utilizando a numeração de (1-6) \n 1- Venda a vista- desconto 10% \n 2- Venda a prazo 30 dias- desconto de 5% \n 3- Venda a prazo 60 dias- mesmo preço \n 4- Venda a prazo 90 dias- acréscimo de 5% \n 5- Venda com cartão de débito- desconto de 8% \n 6- Venda com cartão de crédito- desconto de 7%");
        escolha = Integer.parseInt(escolha1);

        switch (escolha) {
            case 1:
                total = valor + ((valor / 100) * 10);
                break;
            case 2:
                total = valor + ((valor / 100) * 5);
                break;
            case 3:
                total = valor;
                break;
            case 4:
                total = valor + ((valor / 100) * 5);
                break;
            case 5:
                total = valor + ((valor / 100) * 8);
                break;
            case 6:
                total = valor + ((valor / 100) * 7);
                break;
        }

        JOptionPane.showMessageDialog(null, "Nome do vendedor: " + nome + "\n Total da venda: " + total, "Venda efetuada", JOptionPane.PLAIN_MESSAGE);

    }
}
