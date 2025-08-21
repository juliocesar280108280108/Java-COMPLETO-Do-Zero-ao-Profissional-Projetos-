package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos: ");
        int qtdAlunos = entrada.nextInt();

        double[] Alunos = new double[qtdAlunos];

        for (int i = 0; i < Alunos.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            Alunos[i] = entrada.nextDouble();
        }

        System.out.println("Temos " + qtdAlunos + " alunos.");
        System.out.println(Arrays.toString(Alunos));

        entrada.close();
    }
}
