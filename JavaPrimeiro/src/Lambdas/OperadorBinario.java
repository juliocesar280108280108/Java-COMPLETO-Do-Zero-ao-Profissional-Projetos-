package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (Double n1,Double n2) -> (n1+n2) / 2;
        System.out.println(media.apply(10.00, 9.00));

        BiFunction<Double, Double , String> resultado = (n1,n2) -> ((n1+n2) /2) >= 7? "Aprovado" : "Reprovado";
        System.out.println(resultado.apply(7.0, 5.1));

        Function<Double , String> conceito = M -> M >=7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(9.7, 3.5));

    }
}
