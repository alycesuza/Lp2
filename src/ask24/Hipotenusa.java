package ask24;

public class Hipotenusa {

    //M�todo com par�metros da assinatura em Double
    public Double catetos(Double cateto1, Double cateto2){
        return (Math.sqrt((Math.pow(cateto1, 2))+(Math.pow(cateto2,2))));
    }
    //M�todo com par�metros da assinatura em Integer
    public Double catetos(Integer cateto1, Integer cateto2){
        return (Math.sqrt((Math.pow(Double.parseDouble(cateto1+""), 2))+(Math.pow(Double.parseDouble(cateto2+""),2))));
    }
}
