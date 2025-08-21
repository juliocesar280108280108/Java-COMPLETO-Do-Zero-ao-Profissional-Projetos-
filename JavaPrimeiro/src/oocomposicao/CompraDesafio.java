package oocomposicao;

import java.util.ArrayList;

public class CompraDesafio {

    ArrayList<ItemDesafio> itens = new ArrayList<>();

    void adicionarItem(ProdutoDesafio produto, int quantidade) {
        this.itens.add(new ItemDesafio(produto, quantidade));
    }


    void adicionarItem(ProdutoDesafio nome,double preco, int quantidade) {
        var produto = new ProdutoDesafio(null, quantidade);
        this.itens.add(new ItemDesafio(produto, quantidade));
    }


    double obterValorTotal() {
        double total = 0;

        for (ItemDesafio item : itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
