package Generics;

public class CaixaIntTeste {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt();
        caixaA.guardarCoisa(42);

        Integer coisaA = caixaA.abrirCaixa();
        System.out.println(coisaA);
    }
}
