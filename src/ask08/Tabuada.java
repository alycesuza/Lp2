package ask08;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        System.out.print("Digite um número: ");
        numero = entrada.nextDouble();
        System.out.println();

        for(int x=0; x <= 10;x++){

            System.out.printf("%f x %d = %g\n",numero,x,numero*x);
        }


    }
}
