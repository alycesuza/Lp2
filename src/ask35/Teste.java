package ask35;

import java.util.*;

import ask34.Aluno;
import ask34.Pessoa;
import ask34.Professor;

public class Teste {
    List<Pessoa> vetor = new ArrayList<>();

    public static void main(String[] args) {
        Teste teste = new Teste();
        List<Pessoa> lista = new ArrayList<>();
        //Cria��o os objetos
        Aluno aluno = new Aluno("Aluno", "Souza", 1025);
        Aluno aluno2 = new Aluno("Aluno2", "Souza5", 10526);
        Aluno aluno3 = new Aluno("Aluno2", "Souza", 1026);
        Professor professor = new Professor("Professor", "Santos", "Desenvolvimento Web");
        Professor professor2 = new Professor("Professor", "Santos2", "Desenvolvimento Web2");
        Professor professor3 = new Professor("Professor2", "Santos3", "Desenvolvimento Web3");
        Professor professor4 = professor;

        //Adiciona objetos alunos e professores na lista "lista"
        lista.add(aluno); lista.add(aluno2); lista.add(aluno3);
        lista.add(professor); lista.add(professor2); lista.add(professor3); lista.add(professor4);
        lista = teste.verifica(lista);
        lista.forEach(vetor -> System.out.println(vetor));
        teste.diferencia(lista);

    }
    public List<Pessoa> verifica(List<Pessoa> obj) {
        for (int l = 0; l < obj.size(); l++){
            int id = 0;
            for (int c = 0; c < obj.size(); c++){
                if (obj.get(l).getNome() == obj.get(c).getNome()) {
                    id++;
                    if (id > 1){
                        obj.remove(obj.get(l));
                    }
                }
            }
        }
        return obj;
    }

    public void diferencia(List<Pessoa> obj){
        System.out.println("\n**Diferencia as Classes");
        obj.forEach(lista -> {

            System.out.println("O Objeto [" + lista+ "] � do tipo -> "+ lista.getClass().getName());
        });

    }

}
