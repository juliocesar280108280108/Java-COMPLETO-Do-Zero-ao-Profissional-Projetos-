package fundamentos_variaveis_constantes;

public class areacircu {
    public static void main(String[] args) {
         double raio = 3.5;
         final double pi = 3.14159;
         double area = pi*raio*raio;

        System.out.println(area);

        raio = 10;
        area = pi*raio*raio;
        System.out.println("Area = " + area + "m2");
    }
}
