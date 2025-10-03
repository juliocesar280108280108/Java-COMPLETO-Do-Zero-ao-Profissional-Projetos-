package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter { 
    public static void main(String[] args) {
    Produto p1 = new Produto("Notebook", 3500.00, 0.10, 0);
    Produto p2 = new Produto("Smartphone", 2200.00, 0.10, 0);
    Produto p3 = new Produto("Fone Bluetooth", 250.00, 0.10, 0);
    Produto p4 = new Produto("Monitor", 900.00, 0.10, 0);
    Produto p5 = new Produto("Teclado Mecânico", 400.00, 0.10, 0);
    Produto p6 = new Produto("Cadeira Gamer", 1200.00, 0.10, 0);
    Produto p7 = new Produto("HD Externo 1TB", 350.00, 0.10, 0);


       List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);

       Predicate<Produto> promoção = p -> p.desconto >= 0.3;
       Predicate<Produto> fretegratis = p -> p.valorFrete ==0; 
       Predicate<Produto> ProdutoRelevante = p -> p.preco >=500; 

       Function<Produto, String> chamadaPromocional = p -> "aproveite " + p.nome + "por apenas " + p.preco;

       produtos.stream().filter(promoção).filter(fretegratis).filter(ProdutoRelevante).map(chamadaPromocional).forEach(System.out::println);

    }
}
