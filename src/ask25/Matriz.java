package ask25;

import com.sun.jdi.IntegerValue;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Matriz {

    private List<List<Integer>> matrizMain = new ArrayList<List<Integer>>();

    public void criaMatriz() {
        Integer dimensao = Integer.parseInt(JOptionPane.showInputDialog("Dimens�o da Matriz: "));
        System.out.println("Sua Matriz "+dimensao+"x"+dimensao);
        List<List<Integer>> matriz = new ArrayList<List<Integer>>();
        for (int l = 0; l < dimensao; l++){
            List<Integer> linha = new ArrayList<Integer>();
            for (int c = 0; c < dimensao; c++) {
                String text = "Digite o valor da linha ["+(l+1)+"] e coluna ["+(c+1)+"]: ";
                Integer valor = Integer.parseInt(JOptionPane.showInputDialog(text));
                linha.add(valor);
//                System.out.println(linha);
            }
            matriz.add(linha);
        }
        this.matrizMain.addAll(matriz);
        System.out.println("\n**Matriz Criada");
        show();
    }

    //Altera Linha e Coluna da Matriz
    public void alteraLC(){
        System.out.println("\n**Matriz Alterada");
        List<List<Integer>> matriz = new ArrayList<List<Integer>>();

        for (int l = 0; l < this.matrizMain.size(); l++){
            List<Integer> linha = new ArrayList<>();
            for (int c = 0; c < this.matrizMain.size(); c++)
                linha.add(this.matrizMain.get(c).get(l));
            matriz.add(linha);
        }
        this.matrizMain = new ArrayList<List<Integer>>();
        this.matrizMain.addAll(matriz);
        show();
    }

    public void show(){
        Integer cont = 0;
        for(int a = 0; a < this.matrizMain.size(); a++){
            System.out.println(this.matrizMain.get(a));
        }
    }

    public void inicio(){
        criaMatriz();
        alteraLC();
    }
}