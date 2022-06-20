package ask31;

import ask31.Caneta;

public class Caneta {
    private String marca;
    private String cor;
    private double tamanho;

    //Construtor
    public Caneta(String marca, String cor, double tamanho) {
        this.marca = marca;
        this.cor = cor.toUpperCase();
        this.tamanho = tamanho;
    }
    public Caneta() {}

    //Métodos
        //Cadastra canetas
    public Caneta add(String marca, String cor, double tamanho) {
        Caneta c = new Caneta(marca, cor, tamanho);
        return c;
    }
    public Caneta add(Caneta caneta) {
        return caneta;
    }
        //Apresenta todas as canetas
    public void showAll(Caneta[] lista){
        System.out.println("Tamanho das lista:");
        for (int a = 0; a < lista.length; a++){
            System.out.println(lista[a]);
        }
    }
        //Apresenta quantidade de canetas cadastradas
    public void width(Caneta[] lista){
        System.out.println("Sua lista há ["+lista.length+"] elemento(s).");
    }
        //Apresenta quantidade de canetas cadastradas de uma determinada cor
    public void find(Caneta[] lista, String cor){
        System.out.println("-> Caneta(s) na cor "+cor.toUpperCase()+".");
        for (int a = 0; a < lista.length; a++){
            if ((cor.toUpperCase().equals(lista[a].getCor()))) {
                System.out.println(lista[a]);
            }
        }
    }

    //Métodos Get e Set
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    //Método ToString
    @Override
    public String toString() {
        return "Caneta{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor.toLowerCase() + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}

