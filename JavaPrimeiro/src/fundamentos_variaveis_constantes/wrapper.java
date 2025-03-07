package fundamentos_variaveis_constantes;

import java.util.Scanner;

public class wrapper {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Byte b = 100;
        short s = 1000;
        System.out.print("digite o numero integer: ");
        Integer i = Integer.parseInt(entrada.nextLine());
        Long l = 100000l;

        System.out.println(b.byteValue());
        System.out.println(s);
        System.out.println(i * 2);
        System.out.println(l / 3);

        entrada.close();

        float f = 123f;
        System.out.println(f);

        double d =123123.3132;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo.toString().toUpperCase());

        System.out.println(bo);

        Character c = '#';
        System.out.println(c.toString());
    }
}
