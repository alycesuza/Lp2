package ask18;
import java.util.Scanner;
import java.util.Random;
public class Sorteio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();
        boolean acertou = false;
        int chute,tentativas =0;

        int numero = gerador.nextInt(101);

        while(acertou == false){
            System.out.print("Digite um numero de 0 a 100: ");
            chute = entrada.nextInt();
            tentativas++;
            if(chute == numero){
                System.out.println("Você acertou em "+tentativas+" tentativas!");
                acertou = true;
            }else if (chute > numero){
                System.out.println("O numero é menor.");
            }else{
                System.out.println("O numero é maior.");
            }
        }
}

