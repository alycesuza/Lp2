package ask36;

import ask33.InvalidMethodException;

public class Teste {
    public static void main(String[] args) throws InvalidMethodException {
        //Instanciando Objetos
        VeiculoAVenda veiculo = new VeiculoAVenda("Veiculo", "Marca A", "Modelo A", 2021, 500000.00);
        VeiculoAVenda automovel = new VeiculoAVenda("Automovel", "Marca A", "Modelo A", 2021, 1560225);
        VeiculoAVenda moto = new VeiculoAVenda("Moto", "Marca A", "Modelo A", 2021, 1500000.00);

        //Usando m�todo vendido
        System.out.println("M�todo utilizado");
        System.out.println(veiculo.vendido());
        System.out.println(automovel.vendido());
        System.out.println(moto.vendido());

        //Imprimindo Objetos
        System.out.println("\nObjetos Gerados");
        System.out.println(veiculo.toString());
        System.out.println(automovel.toString());
        System.out.println(moto.toString());
    }
}
