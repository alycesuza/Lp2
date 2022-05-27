package ask21;
import java.util.Scanner;
import java.util.Arrays;
public class Vetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int quantidade = entrada.nextInt();
        double media=0;

        int[] numeros = new int[quantidade];
        for(int x=0;x<quantidade;x++){
            System.out.print("Digite o valor "+(x+1)+": ");
            numeros[x]=entrada.nextInt();
            media += numeros[x];
        }
        media = media/quantidade;
        Arrays.sort(numeros);

        System.out.println("A média dos valores é: "+media+"\nO maior valor é: "+numeros[quantidade-1]);
    }
}
