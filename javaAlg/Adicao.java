package javaSenacTech;

import javax.swing.JOptionPane;

public class Adicao {

    public static void main(String args[]) {

        String n1, n2;
        int nro1, nro2, soma;

        n1
                = JOptionPane.showInputDialog("Digite o primeiro número: ");

        n2
                = JOptionPane.showInputDialog("Digite o segundo número: ");

        nro1 = Integer.parseInt(n1);
        nro2 = Integer.parseInt(n2);

        soma = nro1 + nro2;

        JOptionPane.showMessageDialog(null, "Soma dos números digitados foi de " + soma, "Tela Resultado", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);

    }
}
