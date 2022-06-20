package ask14;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class MatrizQuadrada {

    private List<List<Integer>> matriz = new ArrayList<>();

    public void geraMatriz(List<Integer> vetor){
        //Encontra a ordem da matriz
        int size = Integer.parseInt(""+Math.round(Math.sqrt(vetor.size())));
        if (vetor.size() > Math.pow(size, 2)){
            size += 1;
        }
        ordem(size);
        //Adiciona '0' no vetor, se não formar uma matriz quadrada unicamente
        if (vetor.size() < Math.pow(size, 2)){

            for (int x = vetor.size(); x < Math.pow(size, 2); x++){
                vetor.add(0);
            }
        }
        //Cria a matriz na ordem desejada
        List<Integer> lista = new ArrayList<Integer>();
        for (int l = 0; l < Math.pow(size,2); l++){
            lista.add(vetor.get(l));
            if (lista.size() == size) {
                this.matriz.add(lista);
                lista = new ArrayList<Integer>();
            }
        }
        show();
        this.matriz.clear();
    }

    public void show(){
        for(int a = 0; a < this.matriz.size(); a++){
            System.out.println(this.matriz.get(a));
        }
        System.out.println("");
    }

    public void geraMatriz(int[] vetor){
        List<Integer> lista = new ArrayList<Integer>();
        for (int a = 0; a < vetor.length; a++)
            lista.add(vetor[a]);
        geraMatriz(lista);
    }

    public void ordem(int size){
        System.out.println( "Matriz "+size+"x"+size+".");
    }
}
