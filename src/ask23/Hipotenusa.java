package ask23;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Hipotenusa {
    public static void main(String[] args, String Hipotenusa) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o primeiro lado?");
        float lado1 = s.nextFloat();

        System.out.println("Qual o segundo lado?");
        float lado2 = s.nextFloat();


        System.out.println("A Hipotenusa" +Hipotenusa+"é"+(sqrt(lado1*lado1)+(lado2*lado2)));

    }
}
