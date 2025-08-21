package classe;

import java.util.Scanner;

public class DesafioModulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Modulo pp1 = new Modulo("julio ", 70, "pastel", 2);
        System.out.println("Seu nome: " + pp1.nomeP  + "  Seu peso: " + pp1.pesoP+"KG");
        System.out.println("");
        System.out.println("Nome da sua comida: " + pp1.nomeC  + "  Peso da sua comida: " + pp1.pesoC + "KG");
        System.out.println("");
        System.out.println("Seu peso antes de se alimentar: " + pp1.pesoP);
        System.out.println("");
        double pesoFinal = pp1.pesoSubitraido();
        System.out.println("Seu peso atual após se alimentar é :" + pesoFinal);



        entrada.close();
    }
}
