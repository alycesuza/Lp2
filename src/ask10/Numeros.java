package ask10;
import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean parar = false;
        char letra;

        do{
            System.out.print("Digite um numero inteiro: ");
            numero = entrada.nextInt();


            if(numero%2==0){
                System.out.print(" - Numero par.\n");
            }else{
                System.out.print(" - Numero impar. \n");
            }
            if(numero<0){
                System.out.print(" - Numero negativo.\n");
            }else{
                System.out.print(" - Numero positivo.\n");
            }

            System.out.println("Deseja encerrar o programa? (S/N) ");
            letra = entrada.next().charAt(0);
            if(letra == 's' || letra == 'S'){
                parar = true;
            }

        }while(parar==false);

    }
}
