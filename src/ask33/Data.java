package ask33;

import java.util.Date;

public class Data {
    //Atributos
    private Integer dia = null;
    private Integer mes = null;
    private Integer ano = null;

    //Construtor
    public Data(Integer dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public Data(){}

    //M�todos
    public boolean validaData(int dia, int mes, int ano) throws InvalidMethodException {
        boolean bissexto = false;
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] meses = {1,2,3,4,5,6,7,8,9,10,11,12};

        if (ano % 4 == 0) {
            bissexto = true;
        }

        try {
            if (((dia < 1) || (dia > 31)) || ((mes < 1) || (mes > 12)) || (ano < 1)){
                throw new InvalidMethodException("Dados inv�lidos!\nDigite uma data v�lida!!!");
            } else {
                if (bissexto)
                    dias[1] = 29;
                try {
                    for (int a = 0; a < 12; a++){
                        if (meses[a] == mes){
                            if (dia >= 1 && dia <= dias[a]){
                                this.dia = dia; this.mes = mes; this.ano = ano;
                                return true;
                            } else {
                                throw new InvalidMethodException("Digite um dia v�lido para o mes["+mes+"] escolhido!");
                            }
                        }
                    }
                } catch (InvalidMethodException e){
                    System.out.println(e.getMessage());
                }
            }
        } catch (InvalidMethodException  e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    //M�todos Getters e M�todos Setters
    public Integer getDia() {
        return dia;
    }
    public void setDia(Integer dia) {
        this.dia = dia;
    }
    public Integer getMes() {
        return mes;
    }
    public void setMes(Integer mes) {
        this.mes = mes;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    //toString
    @Override
    public String toString() {
        String text = "";
        String[] meses = {"Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        try{
           if ((this.dia != null) || (this.mes != null) || (this.ano != null)){
               for (int i = 1; i <= 12; i++) {
                   if (this.mes == i) {
                       text = meses[i - 1];
                       return dia +"/" + text + "/" + ano;
                   }
               }
           } else
               throw new InvalidMethodException("N�o � poss�vel apresentar uma data no ToString, pois a data inserida � inv�lida.");
        } catch (InvalidMethodException e){
            System.out.println(e.getMessage());
        }
        return "";
    }
}
