package ask24;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Hipotenusa hip = new Hipotenusa();

        // Com dados dos catetos em Double
        System.out.println("O valor da Hiponeusa : "+hip.catetos(4.0,3.0));
        //Com dados dos catetos em Integer
        System.out.println("O valor da Hiponeusa : "+hip.catetos(4,3));

        //Com dados fornecidos pelo usuário
        Double value = Double.parseDouble(JOptionPane.showInputDialog("Cateto 1: "));
        Double value2 = Double.parseDouble(JOptionPane.showInputDialog("Cateto 2: "));

        System.out.println("O valor da Hiponeusa : "+hip.catetos(value,value2));
    }
}