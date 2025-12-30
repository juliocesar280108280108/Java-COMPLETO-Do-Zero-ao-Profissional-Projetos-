package Generics;

public class CaixaObjetoTest {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardarCoisa(2.3);

        Double coisaA = (Double) caixaA.abrirCaixa();
        System.out.println(coisaA);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardarCoisa("Olá");
        
        String coisaB = (String) caixaB.abrirCaixa();
        System.out.println(coisaB);
    }
}
