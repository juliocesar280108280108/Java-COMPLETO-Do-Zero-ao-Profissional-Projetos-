package oocomposicao;

import java.util.ArrayList;

public class ClienteDesafio {

    final String nome;
    ArrayList<CompraDesafio> compras = new ArrayList<>();

    public ClienteDesafio(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        
    }

    double obterValorTotal() {
        double total = 0;

        for (CompraDesafio compra : compras) {
            total += compra.obterValorTotal();
        }

        return total;
    }
}
