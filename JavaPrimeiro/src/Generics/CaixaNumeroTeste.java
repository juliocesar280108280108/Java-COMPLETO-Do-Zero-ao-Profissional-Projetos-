package Generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardarCoisa(3.14);
        Double coisaA = caixaA.abrirCaixa();
        System.out.println(coisaA);

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardarCoisa(100);
        Integer coisaB = caixaB.abrirCaixa();
        System.out.println(coisaB);
    }
}
