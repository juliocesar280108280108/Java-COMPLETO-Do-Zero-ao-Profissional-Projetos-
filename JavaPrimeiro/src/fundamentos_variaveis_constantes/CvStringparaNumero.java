package fundamentos_variaveis_constantes;

import javax.swing.JOptionPane;

public class CvStringparaNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("digite o primeiro numero: ");
        String valor2 = JOptionPane.showInputDialog("digite o segundo numero: ");
        System.out.println("primeiro numero: " + valor1);
        System.out.println("segundo numero: " + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("soma é: " + soma);
        System.out.println("media é: " + soma/2);
        
    }
}
