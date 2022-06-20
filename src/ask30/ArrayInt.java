package ask30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayInt {

    private List<Integer> lista = new ArrayList<Integer>();

    public void ordenar(){
        List<Integer> vetor = new ArrayList<Integer>();

        for (int i = 0; i < 15; i++){
            vetor.add((int) (((-15  ) + Math.random() * 35)));
        }
        //Ordena de forma crescente os valores do vetor
        Collections.sort(vetor);

        //Apresenta na tela o vetor ordenado
        System.out.println(vetor);

    }
}
