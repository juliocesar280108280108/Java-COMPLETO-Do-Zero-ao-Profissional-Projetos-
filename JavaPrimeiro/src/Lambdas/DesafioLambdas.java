package Lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambdas {
    public static void main(String[] args) {
        
        Function<Produto, Double> precoFinal = produto -> produto.preco *(1- produto.desconto);
        UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50; 
       UnaryOperator<Double> arredondar = preco -> new BigDecimal(preco).setScale(4, RoundingMode.HALF_UP).doubleValue();

         Function<Double, String> formatar = preco -> ("R$:" + preco).replace(".", ",");

         Produto p1 = new Produto("ipad", 1000.784378, 0.10);

         String preco = precoFinal.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatar).apply(p1);
         System.out.println("o preco final: " + preco);
    }
}
