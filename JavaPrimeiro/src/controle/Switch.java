package controle;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu grau de faixa de acordo com a cor: ");
        String faixa =entrada.nextLine();

       switch (faixa) {
        case "preta":
            System.out.println("Sei o Bassai-Dai..");
        case "marrom":
            System.out.println("Sei o Kuro-Obi.."); 
        case "roxa":
            System.out.println("Sei o Shidachi..");
        case "verde":
            System.out.println("Sei o Shodan..");
        case "laranja":
            System.out.println("Sei o Nidan..");
        case "vermelha":
            System.out.println("Sei o Sandan..");
        case "amarela":
            System.out.println("Sei o Yondan..");
            break;
        default: 
           System.out.println("nao sei de nada");
       }
       int idade = 3;
       switch (idade) {
        case 3:
            System.out.println("Sabe falar");
            break;
        case 2:
            System.out.println("Sabe andar");
            break;
        case 1:
            System.out.println("Sabe respirar");
        
       
        default:
            break;
       }




       System.out.println("Fim!");
        entrada.close();
        
    }
}
