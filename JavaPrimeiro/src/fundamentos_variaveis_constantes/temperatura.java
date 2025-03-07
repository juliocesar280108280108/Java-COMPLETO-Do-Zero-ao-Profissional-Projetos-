package fundamentos_variaveis_constantes;

public class temperatura {
    public static void main(String[] args) {
        System.out.println("Resolva a seguinte questao de fisica/matematica: (f-32) x 5.0/9.0");
        double FATOR = 5.0/9.0;
        int AJUSTE = 32 ;
        double fahrenheit = 86;
        double celscios = (fahrenheit-AJUSTE) * FATOR;
        System.out.println("resultado = " + celscios);

        fahrenheit = 150;
        celscios = (fahrenheit-AJUSTE) * FATOR;
        System.out.println("resultado = " + celscios);
    }
    
}
