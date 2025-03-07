package fundamentos_variaveis_constantes;

public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean condiçao1 = true;
        boolean condiçao2 = 3>7;

        //e = &&
        System.out.println(condiçao1 && !condiçao2);
        //ou = ||
        System.out.println(condiçao1 || condiçao2);
        //
        System.out.println(condiçao1 ^ condiçao2);
        System.out.println(!!condiçao1);
        System.out.println(!condiçao2);

        
        System.out.println("Tabela verdade E (and)");
        System.out.println(true && true);
        System.out.println(true && false);  
        //System.out.println(false && true);
       // System.out.println(false && false);      

        System.out.println("\nTabela verdade ou (or) ");
       // System.out.println(true || true);
        //System.out.println(true || false);  
        System.out.println(false || true);
        System.out.println(false || false); 
        
        System.out.println("\nTabela verdade ou Exclusivo (xor) ");
        System.out.println(true ^ true);
        System.out.println(true ^ false);  
        System.out.println(false ^ true);
        System.out.println(false ^ false); 

        System.out.println("\nTabela verdade NOT");
        System.out.println( !true);
        System.out.println( !false); 
        

    }
}
