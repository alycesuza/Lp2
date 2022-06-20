package ask27;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Matriz {

    private List<List<Integer>> matriz = new ArrayList<List<Integer>>();
    private Integer dimensao;
    private Integer nElementos;

    public void criaMatriz(){
        this.dimensao = Integer.parseInt(JOptionPane.showInputDialog("Dimens�o da Matriz: "));
        this.nElementos = Integer.parseInt(JOptionPane.showInputDialog("Valor 'k' de elementos a serem encontrados: "));

        for (int l = 0; l < this.dimensao; l++){
            List<Integer> linha = new ArrayList<Integer>();
            for (int c = 0; c < this.dimensao; c++){
                //Gera valor aleat�rio de 0 a 500 e insere no vetor "linha"
                linha.add(new Random().nextInt(501 - 0));
            }
            //Insere o vetor "linha" na matriz "matriz"
            this.matriz.add(linha);
        }
    }
    //Encontra os 'k' elementos
    public void encontraNElementos(){
        List<Integer> vetor = new ArrayList<Integer>();
        //Captura todos os valores da matriz e passa para o vetor 'vetor'
        for (int i = 0; i < this.dimensao; i++){
            vetor.addAll(this.matriz.get(i));
        }
        //Ordena descrescente o vetor 'vetor'
        Collections.sort(vetor, Collections.reverseOrder());
        //recorta o vetor ordenado e apresenta na tela
        System.out.println("\nElemento(s) capturado(s): \n"+vetor.subList(0, this.nElementos));
    }
    //m�todo para se apresentar na tela a matriz "matriz"
    public void show(){
        for(int a = 0; a < this.matriz.size(); a++){
            System.out.println(this.matriz.get(a));
        }
    }
    public void start(){
        System.out.println("\nMatriz Criada");
        criaMatriz();
        show();
        encontraNElementos();
    }

}
