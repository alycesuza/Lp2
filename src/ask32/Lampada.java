package ask32;

public class Lampada {
    private Tipo tipo;
    private double voltagem;
    private String cor;
    private String marca;
    private double preco;
    private double potencia;
    private boolean status;

    //Construtores
    public Lampada(Tipo tipo, double voltagem, String cor, String marca, double preco, double potencia, boolean status) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.status = status;
    }
    public Lampada() {}

    //Métodos
    public boolean ascender(){
        this.status = true;
        return this.status;
    }
    public boolean apagar(){
        this.status = false;
        return this.status;
    }
        //Cadastra lâmpada com o construtor
    public Lampada cadastra(Lampada lampada){
        return lampada;
    }
        //Cadastra lâmpada sem o construtor
    public Lampada adiciona(Tipo tipo, double voltagem, String cor, String marca, double preco, double potencia, boolean status){
        return new Lampada(tipo,voltagem,cor,marca,preco,potencia,status);
    }
        //Exibe qnt de lâmpadas em determinada potência
    public void exibeAPatirPotencia(Lampada[] lampadas, double potencia){
        int qnt = 0;
        for (int e = 0; e < lampadas.length; e++){
            if ((lampadas[e].getPotencia()) == potencia)
                qnt++;
        }
        System.out.println("-> A quantidade de lâmpadas com potência de ["+potencia+"] é de ["+qnt+"] unidade(s).");
    }
        //Exibe os dados das lâmpadas com preco < preço médio toda
    public void exibePrecoMenorQPrecoMedio(Lampada[] lampadas){
        double media = 0.0;
        for (Lampada unidade : lampadas) media += unidade.getPreco();
        media = media / lampadas.length;
        System.out.println("-> Elementos com preço menor que o preço médio ["+media+"].");
        for (Lampada vetor : lampadas){
            if (vetor.getPreco() >= preco)
                System.out.println(vetor);
        }
    }
        //Exibe as lâmpadas apagadas e acesas
    public void estado(Lampada[] lamps){
        int apagadas = 0; int acesas = 0;
        for (Lampada l : lamps){
            if (l.isStatus() == true)
                acesas++;
            else
                apagadas++;
        }
        System.out.println("-> Há ["+acesas+"] luz(es) acesa(s) e ["+apagadas+"] luz(es) apagada(s).");

    }
        //Exibe todas as lâmpadas
    public void showAll(Lampada[] lampadas){
        System.out.println("-> Elementos da lista");
        for (Lampada list : lampadas)
            System.out.println(list);
    }
        //Exibe qnt de lâmpadas cadastradas
    public void tamanhoLista(Lampada[] lampadas){
        System.out.println("\nA lista contém ["+lampadas.length+"] elemento(s)");
    }


    //Métodos Get e Set
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //TOString
    @Override
    public String toString() {
        return "Lampada{" +
                "tipo=" + tipo +
                ", voltagem=" + voltagem +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                ", potencia=" + potencia +
                ", status=" + status +
                '}';
    }
}
