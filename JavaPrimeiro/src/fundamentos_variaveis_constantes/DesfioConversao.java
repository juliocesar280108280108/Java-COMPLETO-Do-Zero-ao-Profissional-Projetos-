package fundamentos_variaveis_constantes;

import java.util.Scanner;

public class DesfioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o salario do primeiro funcionario: ");
        String valor1 = entrada.nextLine().replace(",", ".");

        System.out.print("digite o salario do segundo funcionario: ");
        String valor2 = entrada.nextLine().replace(",", ".");

        System.out.print("digite o salario do terceiro funcionario: ");
        String valor3 = entrada.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double soma = (salario1 + salario2 + salario3);
        double media = (soma)/ 3;
        System.out.println("media do salario entre os 3 funcionarios e de: " + media);

        entrada.close();

    }
}
