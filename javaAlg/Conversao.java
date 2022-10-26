package javaSenacTech;

import javax.swing.JOptionPane;

public class Conversao {

    public static void main(String[] args) {

        double real, dolar, euro;
        String real1, dolar1, euro1;

        real1 = JOptionPane.showInputDialog("real para real");

        dolar1 = JOptionPane.showInputDialog("real para dolar");

        euro1 = JOptionPane.showInputDialog("real para euro");

        real = Double.parseDouble(real1);
        dolar = (Double.parseDouble(dolar1) * 5.41);
        euro = (Double.parseDouble(euro1) * 5.54);

        JOptionPane.showMessageDialog(null, "em reais: " + real + "\n em dolar: " + dolar + "\n em euro: " + euro, "Convertor Real", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);

    }
}
