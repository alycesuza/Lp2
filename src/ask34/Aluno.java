package ask34;

public class Aluno extends Pessoa{

    //Atributo
    private int matricula;

    //Construtor
    public Aluno(String nome, String sobrenome, int matricula) {
        super(nome, sobrenome);
        this.matricula = matricula;
    }
    public Aluno(){}

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    //M�todo Getter e M�todo Setter
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //ToString

    @Override
    public String toString() {
        return "Aluno{" +
                "nome="+super.getNome()+
                ", sobrenome="+super.getSobrenome()+
                ", matricula=" + matricula +
                '}';
    }
}
