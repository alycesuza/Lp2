package ask12;
import java.util.Scanner;
public class Numero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,maior,menor;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();
        menor = numero;
        maior = numero;

        do{
            System.out.print("Digite outro número: ");
            numero = entrada.nextInt();

            if(numero>maior) maior = numero;
            if(numero<menor&&numero!=0) menor = numero;

        }while(numero != 0);

        System.out.println("\nO menor número é "+menor+" e o maior número é "+maior+".");

    }
}
