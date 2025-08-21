package oocomposicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "Joao Pedro";
        compra1.adicionarItem(new Item( "lapis", 3 , 10 ));
        compra1.adicionarItem(new Item( "borracha", 5 , 10 ));
        compra1.adicionarItem(new Item( "papel", 7 , 10 ));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.ObterValorTotal());
    }
}
