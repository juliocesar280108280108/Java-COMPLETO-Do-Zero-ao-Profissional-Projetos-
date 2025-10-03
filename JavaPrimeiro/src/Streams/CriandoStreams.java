package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

       Consumer<String> print = System.out::print;

       Stream<String> langs = Stream.of("java  ", "python n ", "js\n");
       langs.forEach(print);

       String[] maisLangs = {"Python ", "Lips ", "Perl " ,"React\n"};

       Stream.of(maisLangs).forEach(print);
       Arrays.stream(maisLangs).forEach(print);
       Arrays.stream(maisLangs, -0, 4).forEach(print);

       List<String> outrasLangs = Arrays.asList("C++ ", "PHP ", "COBOL ", "C#\n");
       outrasLangs.stream().forEach(print);
       

    }
}
