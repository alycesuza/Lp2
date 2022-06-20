package ask29;


import javax.swing.*;

public class Binario {
    private Integer decinal;
    private String binario =  "";

    public void converter(){
        this.decinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor em Decimal: "));
        Integer value = this.decinal;
        String text = "";
        while (value > 0){
            text += ""+ (value % 2);
            value /= 2;

        }
        //Ordena corretamente o valor em bin�rio
        for (int i = text.length(); i > 0; i--){
            this.binario += text.substring(i-1, i);
        }
        //Apresenta o valor em bin�rio na tela
        System.out.println("O valor ["+this.decinal+"] em Decimal � ["+this.binario+"] em Bin�rio.");
    }
}