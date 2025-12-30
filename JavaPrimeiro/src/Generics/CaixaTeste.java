package Generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<String>();
        caixaA.guardarCoisa("segredo!");
        
        String coisaA = caixaA.abrirCaixa();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<Double>();
        caixaB.guardarCoisa(3.1415);

        Double coisaB = caixaB.abrirCaixa();
        System.out.println(coisaB);}
}
