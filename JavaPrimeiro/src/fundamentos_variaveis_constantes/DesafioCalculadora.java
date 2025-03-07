package fundamentos_variaveis_constantes;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o tipo de cálculo: (+ , - , * , / , %)");
        System.out.print("Digite aqui a sua escolha de cálculo: ");
        String tipoDeCálculo = entrada.next();
        
        // Recebe os números como String para permitir o uso de ponto ou vírgula
        System.out.print("Digite o seu primeiro número: ");
        String num1Str = entrada.next().replace(",", ".");
        
        System.out.print("Digite o seu segundo número: ");
        String num2Str = entrada.next().replace(",", ".");
        
        // Converte as entradas para double
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);

        double resultado = 0;
        boolean operaçãoVálida = true;
        switch (tipoDeCálculo) {
            case "+":
                resultado = num1 + num2;
                break;

            case "-":
                resultado = num1 - num2;
                break;
                
            case "*":
                resultado = num1 * num2;
                break;
                
            case "/":
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por 0 não permitida");
                    operaçãoVálida = false;
                } else {
                    resultado = num1 / num2;
                }
                break;
                
            case "%":
                resultado = num1 % num2;
                break;
                
            default:
                System.out.println("Operação inválida");
                operaçãoVálida = false;
                break;
        }

        if (operaçãoVálida) {
            System.out.println("O resultado da operação é: " + resultado);
        }

        entrada.close();
    }
}
