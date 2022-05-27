package ask09;
import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int C;
        double N,E=0,PrecoHora,PrecoExcedente;
        boolean continuar = true;
        char texto;

        do{
            E=0;
            PrecoHora=10;
            PrecoExcedente=PrecoHora*2;

            System.out.print("Digite o código do operário: ");
            C = entrada.nextInt();

            System.out.print("Digite o número de horas trabalhadas: ");
            N = entrada.nextDouble();

            if(N>50){
                E = N-50;
            }

            System.out.println("\nID: "+C+"\nSalario: "+(N*PrecoHora)+"\nSalario excedente: "+(E*PrecoExcedente)+"\nSalario total: "+(E*PrecoExcedente+N*PrecoHora)+"\n\nDeseja encerrar o programa?(s/N) ");
            texto = entrada.next().charAt(0);
            if(texto == 's' || texto == 'S'){
                continuar = false;
            }

        }while(continuar);

    }
}
