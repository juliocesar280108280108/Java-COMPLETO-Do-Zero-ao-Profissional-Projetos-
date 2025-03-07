package operadores;

public class relacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a';

        System.out.println(a == b);

        System.out.println(3>4);
        System.out.println(3>=3);
        System.out.println(30<=7);
        System.out.println(30!=7);

        double nota = 7.9;
        boolean BomComportamento = true;
        boolean PassouPorMedia = nota >=7;
        boolean desconto = BomComportamento && PassouPorMedia;
        System.out.println("tem desconto? " + desconto);
    }
}
