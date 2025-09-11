package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        Supplier<List<String>> umaLIsta = () -> Arrays.asList("ana", "bia", "lia", "gui");

        System.out.println(umaLIsta.get());
    }
}
