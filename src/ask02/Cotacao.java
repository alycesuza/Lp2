package ask02;
import java.util.Scanner;
public class Cotacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cotacao_dolar, valor_dolar,valor_real;

        System.out.print("Conversor de dolar em real\n\n");

        System.out.print("Digite a cotacao do dolar: ");
        cotacao_dolar = entrada.nextDouble();

        System.out.print("Digite o valor em dolar: ");
        valor_dolar = entrada.nextDouble();

        valor_real = cotacao_dolar * valor_dolar;

        System.out.print("O valor em reais: " + valor_real + "\n");

    }
}
