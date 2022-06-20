package ask36;

import ask33.InvalidMethodException;

public class VeiculoAVenda implements InterfaceVeiculo{
    //Atributos
    private String tipo;
    private String marca;
    private String modelo;
    private int ano;
    private double precoDeVenda;

    //Construtor
    public VeiculoAVenda(String tipo, String marca, String modelo, int ano, double precoDeVenda) throws InvalidMethodException {
        try {
            if (precoDeVenda > 1){
                this.tipo = tipo;
                this.marca = marca;
                this.modelo = modelo;
                this.ano = ano;
                this.precoDeVenda = precoDeVenda;
            }
            else {
                throw new InvalidMethodException("Insira um valor v�lido!");
            }
        } catch (InvalidMethodException e){
            System.out.println(e.getMessage());
        }
    }
    public VeiculoAVenda(){}

    //M�todos Getters e M�todos Setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getPrecoDeVenda() {
        return precoDeVenda;
    }
    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    //ToString
    @Override
    public String toString() {
        return "VeiculoAVenda{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", precoDeVenda=" + precoDeVenda +
                '}';
    }

    @Override
    public String vendido() {
        return "Tipo="+tipo+", PrecoDeVenda="+precoDeVenda;
    }
}
