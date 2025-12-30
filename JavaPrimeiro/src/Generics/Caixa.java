package Generics;

public class Caixa<TIPO> {
    private TIPO coisa; 

     public void guardarCoisa(TIPO coisa) {
        this.coisa = coisa;
    }

    public TIPO abrirCaixa() {
        return coisa;
    }
}
