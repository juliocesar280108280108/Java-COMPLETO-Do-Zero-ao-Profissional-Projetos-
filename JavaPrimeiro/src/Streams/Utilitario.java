package Streams;

import java.util.function.UnaryOperator;

public interface Utilitario {
    
        public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        public final static UnaryOperator<String> primeriraLetra = n -> n.charAt(0)+ "";
        public  static UnaryOperator<String> grito = n -> n +"!!! ";
}
