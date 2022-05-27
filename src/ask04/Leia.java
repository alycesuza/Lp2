package ask04;
import java.util.Scanner;

public class Leia {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int troca;

        Scanner vara = new Scanner(System.in);
        System.out.print("Informe a variavel A : ");
        a = Integer.parseInt(vara.nextLine());

        Scanner varb = new Scanner(System.in);
        System.out.print("Informe a variavel B : ");
        b = Integer.parseInt(varb.nextLine());

        troca = a;
        a = b;
        b = troca;
        System.out.println("Efetuando a troca ...");
        System.out.println("O valor de A : " + a);
        System.out.println("O valor de B : " + b);
    }
}
