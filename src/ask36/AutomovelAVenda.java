package ask36;

import ask33.InvalidMethodException;

public class AutomovelAVenda extends VeiculoAVenda {

    //Construtor
    public AutomovelAVenda(String marca, String modelo, int ano, double precoDeVenda) throws InvalidMethodException {
        super("Autom�vel", marca, modelo, ano, precoDeVenda);
    }
    public AutomovelAVenda() {
    }
    @Override
    public String vendido() {
        return "O ve�culo do Tipo="+super.getTipo()+", foi vendido ao PrecoDeVenda="+super.getPrecoDeVenda();
    }

    //toString
    @Override
    public String toString() {
        return "MotocicletaAVenda{ tipo="+
                super.getTipo()+
                ", marca="+super.getMarca()+
                ", modelo="+super.getModelo()+
                ", ano="+super.getModelo()+
                ", precoVenda="+super.getPrecoDeVenda()+
                "}";
    }
}
