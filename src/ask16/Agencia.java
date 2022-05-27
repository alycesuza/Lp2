package ask16;
import java.util.Scanner;
public class Agencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroCandidatas = 5;
        int quantidade_aptas = 0;
        String[] nome = new String[numeroCandidatas];
        int[] idade = new int[numeroCandidatas];



        for(int x=0;x<numeroCandidatas;x++){
            System.out.print("Digite o nome da "+(x+1)+"ª candidata: ");
            nome[x]= entrada.nextLine();

            System.out.print("Digite a idade da "+(x+1)+"ª candidata: ");
            idade[x] = Integer.parseInt(entrada.nextLine());

            if(idade[x]>=18&&idade[x]<21){
                quantidade_aptas++;
            }
        }


        String[] nome_aptas = new String[quantidade_aptas];
        int[] idade_aptas = new int[quantidade_aptas];

        int y=0;
        for(int x=0;x<numeroCandidatas;x++){
            if(idade[x]>=18&&idade[x]<21){
                nome_aptas[y] = nome[x];
                idade_aptas[y] = idade[x];
                y++;
            }
        }

        System.out.println();

        for(int x=0;x<quantidade_aptas;x++){
            System.out.printf("Nome: %-30.30s \t Idade: %d\n",nome_aptas[x],idade_aptas[x]);
        }

    }
}
