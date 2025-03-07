package fundamentos_variaveis_constantes;

public class desafiodois {
    public static void main(String[] args) {

        double pp = Math.pow(6*(3+2), 2);
        double pdiv = pp / (3*2);
        System.out.println(pdiv);

        double sp = (1-5)*(2-7); ;
        double sdiv =Math.pow(sp / 2, 2);
        System.out.println(sdiv);

        double t =Math.pow((pdiv - sdiv), 3);
        System.out.println(t);

        double d =Math.pow(10, 3);
        double resultado = t / d ;
        System.out.println("resultado: " + resultado);

    }
    
}
