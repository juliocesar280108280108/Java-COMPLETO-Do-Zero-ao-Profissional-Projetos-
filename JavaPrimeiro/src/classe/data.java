package classe;

public class data {
    public static void main(String[] args) {
        Dataa d1 = new Dataa();


        var d2 = new Dataa( 1 , 1 , 1970);

        String dataFormada1 = d1.obterDataFormatada();

        System.out.println(dataFormada1);
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormada();
        d2.imprimirDataFormada();
    }
}
