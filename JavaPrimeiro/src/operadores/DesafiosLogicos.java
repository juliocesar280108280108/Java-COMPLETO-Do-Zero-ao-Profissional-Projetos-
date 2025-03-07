package operadores;

public class DesafiosLogicos {
    public static void main(String[] args) {

        boolean trabalho1 = true ;
        boolean trabalho2 = true ;

        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean sorvete = trabalho1 || trabalho2;
        boolean saudavel = !sorvete;
        System.out.println("comprou a tv 50? " + tv50);
        System.out.println("comprou a tv 32? " + tv32);
        System.out.println("comprou o sorvete" + sorvete);
        System.out.println("ficou mais saudavel?" + saudavel);

        
        
    }
}
