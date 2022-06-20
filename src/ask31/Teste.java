package ask31;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Caneta> listPen = new ArrayList<Caneta>(50);
        Caneta[] pen = new Caneta[50];

        //Cadastra caneta
        Caneta caneta = new Caneta();
        pen[0] = caneta.add(new Caneta("Faber Castel", "Preto", 10.0));

        //Cria 19 canetas de cor Vermelho
        String marca; String cor; double tamanho;
        for (int e = 1; e < 20; e++){
            Caneta ab = new Caneta();
            marca = "Marca"+(e+1);  cor = "Vermelho"; tamanho = 0.1 * (e+1);
            pen[e] = ab.add(new Caneta(marca, cor, tamanho));
        }
        //Cria 19 canetas de cor Azul
        for (int e = 20; e < 40; e++){
            Caneta ab = new Caneta();
            marca = "Marca"+(e+1);  cor = "Azul"; tamanho = 0.1 * (e+1);
            pen[e] = ab.add(marca, cor, tamanho);
        }
        //Cria 19 canetas de cor Amarelo
        for (int e = 40; e < 50; e++){
            marca = "Marca"+(e+1);  cor = "Amarelo"; tamanho = 0.1 * (e+1);
            pen[e] = new Caneta(marca, cor, tamanho);

        }

        //Captura tamanho do vetor (quantidade de caneta(s) cadastrada(s)
        caneta.width(pen);
        //Encontra elementos da cor preto
        caneta.find(pen, "preto");
        //Apresenta todas as canetas
        caneta.showAll(pen);


    }
}
