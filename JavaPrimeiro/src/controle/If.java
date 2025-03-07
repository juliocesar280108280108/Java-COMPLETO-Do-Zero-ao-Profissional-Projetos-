package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a Media: ");

        String media = entrada.nextLine().replace(",", ".");
        double num1 = Double.parseDouble(media);
        
       if (num1>=7.0) {
        System.out.println("aprovado");
       }
       
        else {
            System.out.println("Reprovado");
        }
       
        entrada.close();
    }
}