package Lambdas;

import java.util.function.Function;

public class Fucao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0? "Par" : "impar";
        System.out.println(parOuImpar.apply(33));


        Function<String, String> oResultado = valor -> "o Resultado é: " + valor;
        Function<String, String> empolgado = valor -> valor + "!!!";
        String resultadoFinal = parOuImpar.andThen(oResultado).andThen(empolgado).apply(32);
        System.out.println(resultadoFinal);

        
    }
}
