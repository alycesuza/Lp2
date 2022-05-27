package ask05;
import java.util.Scanner;
public class Modulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Numero,ModuloNumero;

        System.out.print("Modulo de numero\n\n"); //Finalmente...


        System.out.print("Digite um numero inteiro:  ");
        Numero = entrada.nextInt();


        ModuloNumero = (Numero < 0)? ModuloNumero = Numero*(-1):Numero;

        System.out.print("O modulo do nnmero : "+ModuloNumero+"\n");

    }
}
