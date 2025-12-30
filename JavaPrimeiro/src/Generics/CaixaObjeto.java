package Generics;

public class CaixaObjeto {

    private Object coisa; 

     public void guardarCoisa(Object coisa) {
        this.coisa = coisa;
}

public Object abrirCaixa() {
        return coisa;
    }
}
