package oocomposicao;

public class Sistema {

    public static void main(String[] args) {

        ClienteDesafio cliente = new ClienteDesafio("julio cesar");

        CompraDesafio compra1 = new CompraDesafio();

        compra1.adicionarItem(new ProdutoDesafio("caneta", 9.67), 1);
        compra1.adicionarItem(new ProdutoDesafio("notbook", 1987.88), 2);

         CompraDesafio compra2 = new CompraDesafio();
        compra2.adicionarItem(new ProdutoDesafio("caderno", 10), 10);
        compra2.adicionarItem(new ProdutoDesafio("impressora", 998.90), 1);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);


        System.out.println("Valor total da compra: R$ " + compra1.obterValorTotal());
    }
}
