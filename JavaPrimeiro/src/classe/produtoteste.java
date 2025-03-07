package classe;

public class produtoteste {
    public static void main(String[] args) {

    Produto p1 = new Produto("Notebook", 4000);
       Produto p2 =new Produto("caneta",12.99);
       System.out.println("Produto 1: " + p1.nome + " R$ " + p1.preco);
       System.out.println("Produto 2: " + p2.nome + " R$ " + p2.preco);

       System.out.println("valor do desconto no produto 1: " + p1.desconto);
       System.out.println("valor do desconto no produto 2: " + p2.desconto);

       double preocoFinal1 = p1.precoComDesconto();
       double preocoFinal2 = p2.precoComDesconto();
       System.out.printf("Preço final do produto 1: R$: %.2f \n" , preocoFinal1 );
       System.out.printf("Preço final do produto 2: R$: %.2f \n" , preocoFinal2 );
    }
    
}
