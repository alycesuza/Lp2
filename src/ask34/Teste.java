package ask34;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Teste {
    public static void main(String[] args) {
        //Cria��o os objetos
        Pessoa pessooa = new Pessoa("Pessoa 01", "Silva");
        Aluno aluno = new Aluno("Aluno", "Souza", 1025);
        Professor professor = new Professor("Professor", "Santos", "Desenvolvimento Web");

        //Apresentando os objetos
        System.out.println(pessooa.toString());
        System.out.println(aluno.toString());
        System.out.println(professor.toString());

        //Serializa��o
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser")) ) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
