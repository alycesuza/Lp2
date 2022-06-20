package ask26;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MatrizQuadrada {

    private List<List<Boolean>> boo = new ArrayList<List<Boolean>>();
    private Integer dimensao;

    public void criaMatriz(){
        this.dimensao = Integer.parseInt(JOptionPane.showInputDialog("Ordem da Matriz: "));

        for (int l = 0; l < this.dimensao; l++) {
            List<Boolean> linha = new ArrayList<Boolean>();
            for (int c = 0; c < this.dimensao; c++) {
                String text = "Digite o valor da linha [" + (l + 1) + "] e coluna [" + (c + 1) + "]:  \nDigite 'true' ou 'false'";
                //Pega valor booleano digitado pelo usu�rio
                Boolean value = Boolean.parseBoolean(JOptionPane.showInputDialog(text));
                //Inseri o valor booleano digitado na vetor "linha"
                linha.add(value);
            }
            //Inseri o vetor "linha" na matriz "boo"
            this.boo.add(linha);
        }
    }
    //m�todo para se apresentar na tela a matriz "boo"
    public void show(){
        Integer cont = 0;
        for(int a = 0; a < this.boo.size(); a++){
            System.out.println(this.boo.get(a));
        }
    }
    //m�todo que faz a altera��o pedida no exerc�cio na matriz criada
    public void alteraMatriz(){
        List<List<Boolean>> matriz = new ArrayList<List<Boolean>>();

        for (int x = 0; x < this.dimensao; x++){
            List<Boolean> linha = new ArrayList<Boolean>();
            for (int y = 0; y < this.dimensao; y++){
                linha.add(this.boo.get(x).get(y) && this.boo.get(y).get(x));
            }
            matriz.add(linha);
        }

        this.boo = matriz;
    }

    //Fun��o para iniciar o software
    public void start(){
        System.out.println("**Matriz Criada");
        criaMatriz();
        show();
        System.out.println("\n**Matriz Alterada");
        alteraMatriz();
        show();
    }
}
