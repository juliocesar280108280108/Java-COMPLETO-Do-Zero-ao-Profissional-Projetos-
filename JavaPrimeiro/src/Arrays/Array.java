package Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        double[] notasAlunosA = new double[4];
        notasAlunosA[0] = 7.0;
        notasAlunosA[1] = 8;
        notasAlunosA[2] = 10;
        notasAlunosA[3] = 5;
      
        System.out.println(Arrays.toString(notasAlunosA));

        double totalAlunoA = 0;
        
        for(int i = 0; i < notasAlunosA.length ; i++){
            totalAlunoA += notasAlunosA[i];
        }

        double mediaA = totalAlunoA/notasAlunosA.length;
        System.out.print("Total aluno A : " + totalAlunoA +"\n");
        System.out.print("A media aluno A é: " + mediaA );



        final double zero = 6.9;
        double[] notasAlunosB = {zero, 8.9, 5.5, 10};

        
        double totalAlunoB = 0;
        System.out.println("");

        for(int i = 0 ; i< notasAlunosB.length; i++){
            totalAlunoB += notasAlunosB[i]; 
        }
        double mediaB = totalAlunoB/notasAlunosB.length;
        System.out.print("Total aluno B: " + totalAlunoB+"\n");
        System.out.println("A media aluno B é: " + mediaB);


    }
    
    
}
