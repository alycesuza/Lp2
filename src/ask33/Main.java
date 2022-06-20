package ask33;

public class Main {
    public static void main(String[] args) throws InvalidMethodException {
        Data data = new Data();
        data.validaData(31, 12, 2000);
        System.out.println(data.toString());

    }
}
