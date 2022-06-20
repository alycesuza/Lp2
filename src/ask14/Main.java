package ask14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MatrizQuadrada matriz = new MatrizQuadrada();

        //Caso 01 - List
        List<Integer> vetor = new ArrayList<Integer>();
        for (int a=1; a < 11; a++) vetor.add(a);
        matriz.geraMatriz(vetor);

        //caso 02 - Com vetor
        matriz.geraMatriz(new int[] {10,21,32,43,54,65,76});
    }
}
