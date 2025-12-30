package Generics;

import java.util.SortedSet;
import java.util.TreeSet;

public class Pares<C extends Number,V> {
    private final SortedSet<Par<C,V>> itens = new TreeSet<>();

    public void adicionar(C chave, V valor) {
        if (chave == null) {
            return;
        }
        Par<C,V> novoPar = new Par<>();
        novoPar.setChave(chave);
        novoPar.setValor(valor);
        this.itens.add(novoPar);
    }
}
