package classe;

public class DesafioClasseData {
    public static void main(String[] args) {
        Dataa c1 = new Dataa();
        c1.dia = 28;
        c1.mes = 1;
        c1.ano = 2020;

        Dataa c2 = new Dataa();
        c2.dia = 29;
        c2.mes = 12;
        c2.ano = 2023;
        
        Dataa c3 = new Dataa();
        c3.dia = 30;
        c3.mes = 2;
        c3.ano = 2022;

        System.out.println("Data C1: " + c1.obterDataFormatada());
        System.out.println("Data C2: " + c2.obterDataFormatada());
        System.out.println("Data C3: " + c3.obterDataFormatada());
        
    }
}
