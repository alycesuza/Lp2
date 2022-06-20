package ask36;

import ask33.InvalidMethodException;

public class MotocicletaAVenda extends VeiculoAVenda{

    //Construtor

    public MotocicletaAVenda(String marca, String modelo, int ano, double precoDeVenda) throws InvalidMethodException {
        super("Motocicleta", marca, modelo, ano, precoDeVenda);
    }

    public MotocicletaAVenda() {
    }

    @Override
    public String vendido() {
        return "O Ve�culo do Tipo="+super.getTipo()+", foi vendido ao PrecoDeVenda="+super.getPrecoDeVenda();
    }

    //ToString
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
