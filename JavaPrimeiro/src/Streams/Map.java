package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        List<String> marcas = Arrays.asList("bMW ", "aUDI ", "hONDA ");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

      
        System.out.println("\n\nUsando composição...");

        marcas.stream().map(Utilitario.maiuscula).map(Utilitario.primeriraLetra).map(Utilitario.grito).forEach(print);
    }
}
