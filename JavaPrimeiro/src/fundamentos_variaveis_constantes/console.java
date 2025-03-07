package fundamentos_variaveis_constantes;

import java.util.Scanner;

public class console {
    public static void main(String[] args) {
    System.out.print("bom");
    System.out.print("dia!\n");
    
    System.out.println("bom");
    System.out.println("dia!");

    System.out.printf("mega-sena: %d %d %d %d %d\n",  1,2,3,4,5);
    System.out.printf("salario %.1f \n",131223.231231);
    System.out.printf("nome: %s","(meu nome???)\n " );
    
   
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = entrada.nextLine();

    System.out.print("Digite seu sobrenome: ");
    String sobrenome = entrada.nextLine();

    System.out.print("Digite seu idade: ");
    int idade = entrada.nextInt();
    

    System.out.printf("%s %s tem %d anos", nome,sobrenome,idade);
    
    entrada.close();
    

    }
}
