package ask01;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        int qtdMin, qtdMax;

        Scanner scQtdMin = new Scanner(System.in);
        System.out.print("Digite a quantidade minima: ");

        qtdMin = Integer.parseInt(scQtdMin.nextLine());

        Scanner scQtdMax = new Scanner(System.in);
        System.out.print("Digite a quantidade maxima: ");

        qtdMax = Integer.parseInt(scQtdMax.nextLine());

        if (qtdMin > qtdMax) {
            System.out.println("A quantidade maxima deve ser maior que a mínima.");
            return;
        }

        System.out.println("Resultado da media calculdada: " + calcularEstoqueMedio(qtdMin, qtdMax));

    }

    static int calcularEstoqueMedio(int qtdMin, int qtdMax) {
        return (qtdMin + qtdMax) / 2;
    }
}
