package ask13;
import java.util.Scanner;
public class Monge {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double graosCasa=1,casasTabuleiro=64;
        int graos=1;

        for(int x=1;x<casasTabuleiro;x++){
            graosCasa = graosCasa*2;
            graos +=graosCasa;
        }

        System.out.println("\nO quantidade de grãos é: "+graos);

    }
}
