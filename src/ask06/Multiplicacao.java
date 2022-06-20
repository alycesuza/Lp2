package ask06;
import java.util.Scanner;
import java.util.Arrays;
public class Multiplicacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[3];

        System.out.print("Verificador de variaveis\n\n");

        for (int x= 0; x < 3; x++) {
            System.out.print("Digite o valor "+(x+1)+": ");
            valores[x] = entrada.nextInt();
            while(valores[x]<=0){
                System.out.print("Digite um valor valido no valor "+(x+1)+": ");
                valores[x] = entrada.nextInt();
            }
        }
        Arrays.sort(valores);
        System.out.print("Menor valor lido multiplicado pelo maior: "+(valores[0]*valores[2])+" . E o maior valor dividido pelo menor: "+(valores[2]/valores[0]));
    }
}

