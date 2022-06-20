package ask34;

public class Professor extends  Pessoa{
    //Atributo
    private String disciplina;

    //Construtor
    public Professor(String nome, String sobrenome, String disciplina) {
        super(nome, sobrenome);
        this.disciplina = disciplina;
    }
    public Professor(){}

    public Professor(String disciplina) {
        this.disciplina = disciplina;
    }

    //M�todo Getter e M�todo Setter
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    //ToString

    @Override
    public String toString() {
        return "Professor{" +
                "nome="+super.getNome()+
                ", sobrenome="+super.getSobrenome()+
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
