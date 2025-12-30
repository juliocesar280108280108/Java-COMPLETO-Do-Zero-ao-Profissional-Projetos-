package Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTest {
    public static void main(String[] args) {
        List<String> Langs = Arrays.asList("Java", "Python", "C++", "JavaScript");
        List<Integer> Nums = Arrays.asList(10, 20, 30, 40, 50);
        
        String ultimaLinguagem = (String) ListaUtil.getUltimo1(Langs);
        System.out.println(ultimaLinguagem);

        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(Nums);
        System.out.println(ultimoNumero);
        

        String ultimaLinguagem2 = ListaUtil.getUltimo2(Langs);
        System.out.println(ultimaLinguagem2);

        Integer ultimoNumero2 = ListaUtil.getUltimo2(Nums);
        System.out.println(ultimoNumero2);
    }
}
