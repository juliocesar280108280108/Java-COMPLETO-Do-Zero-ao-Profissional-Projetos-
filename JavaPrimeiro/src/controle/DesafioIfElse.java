package controle;

import java.util.Scanner;

public class DesafioIfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu dia da semana favorito: ");
        String diadasemana =entrada.next();
       
        if (diadasemana.equalsIgnoreCase("Dominngo") ) {
            System.out.println("1");
        }
        else if (diadasemana.equalsIgnoreCase("Segunda")) {
            System.out.println("2");
        }
        else if (diadasemana.equalsIgnoreCase("Terça")) {
            System.out.println("3");
        }
        else if (diadasemana.equalsIgnoreCase("Quarta")) {
            System.out.println("4");
        }
        else if (diadasemana.equalsIgnoreCase("Quinta")) {
            System.out.println("5");
        }
        else if (diadasemana.equalsIgnoreCase("Sexta")) {
            System.out.println("6");
        }
        else if (diadasemana.equalsIgnoreCase("Sabado")) {
            System.out.println("7");
        }

        else{
            System.out.println("Digite um dia da semana animal não sabe Ecrever?!!!");
        }
        
        entrada.close(); 
    }
}
