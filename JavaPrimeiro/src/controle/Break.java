package controle;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for( int i = 0; i < 10; i++ ){
            if ( i == 5 ){
                break;
                
            }
            System.out.println(i);
        }

        System.out.println("Fim!");
        entrada.close();
    }
}
