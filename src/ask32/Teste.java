package ask32;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        Lampada[] lista = new Lampada[30];

        //Adiciona Lâmpada
        Lampada lampada = new Lampada();
        lista[0] = lampada.adiciona(Tipo.LED, 120, "branco", "A", 12.75,1200, false);

        //Adiciona Lâmpadas (com potencia inserida automativamento"
        for (int e = 1; e < 30; e++){
            Tipo tipo = Tipo.LED; double potencia = 1200;
            Lampada a = new Lampada();
            if (e > 5) {
                tipo = tipo.FLUORESCENTE; potencia = 1250;
            }
            if (e > 22) {
                tipo = tipo.INCANDECENTE; potencia = 1300;
            }
            lista[e] = a.adiciona(tipo, 220, "branco", "A", (10+(e*0.5)), potencia, false);
            //Acende lampada
            if (e % 2 == 0)
                lista[e].ascender();
            //Apaga lâmpada
            if (e % 4 == 0)
                lista[e].apagar();
        }


        //Exibe todas as lâmpadas
        lampada.showAll(lista);
        //Exibe qnt de lâmpadas cadastradas
        lampada.tamanhoLista(lista);
        //Exibe qnt de lâmpadas com potencia digitada pelo user
        lampada.exibeAPatirPotencia(lista, Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da potência: ")));
        //Exibe os dados dos elemntos com preco menor que o preco médio
        lampada.exibePrecoMenorQPrecoMedio(lista);
        //Exibe qnt de lâmpadas acesas e apagadas
        lampada.estado(lista);

    }
}
