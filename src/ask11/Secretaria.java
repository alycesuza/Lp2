package ask11;
import java.util.Scanner;
public class Secretaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        boolean parar = false;
        char letra;

        do{
            do{
                System.out.print("Digite o índice de poluição: ");
                numero = entrada.nextDouble();
                if(numero<0) System.out.print("Número inválido digite um número positivo.");
            }while(numero<0);

            System.out.println();

            if(numero>=0&&numero<=0.25){
                System.out.println("Índice de poluição aceitável.");
            }


            if(numero>=0.3){
                System.out.println("Suspender atividades das indústrias do 1° Grupo!");
            }

            if(numero>=0.4){
                System.out.println("Suspender atividades das indústrias do 2° Grupo!");
            }

            if(numero>=0.5){
                System.out.println("Suspender atividades das indústrias do 3° grupo!");
            }

            System.out.println("\nDeseja encerrar o programa? (s/N) ");
            letra = entrada.next().charAt(0);
            if(letra == 's' || letra == 'S'){
                parar = true;
            }

        }while(parar==false);

    }
}
