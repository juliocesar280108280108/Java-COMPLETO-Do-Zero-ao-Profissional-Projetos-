package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("igite o primeiro numero: ");
        String valor1 =entrada.next().replace(",", ".");
        double nota =Double.parseDouble(valor1);

        if (nota > 10 || nota <0) {
            System.out.println("Nota ivalida");
        }
        else if (nota >= 8.0) {
            System.out.println("Conceito A"); 
        }   

         else if (nota>=6) { 
            System.out.println("Conceito B"); 
        }
        else if (nota >=4) {
            System.out.println("Conceiro C"); 
        }
        else if (nota >=2) {
            System.out.println("Conceiro D"); 
        }
        else{
            System.out.println("Conceiro e");
        }
       


        




        entrada.close();
    }
}
