package fundamentos_variaveis_constantes;

public class notaçaoPonto {
    public static void main(String[] args) {
    
        String s = "bom dia x ";

        //toUpperCase e para deixar e, negrito 
        s = s.toUpperCase();
        //para subistituir
        s=s.replace("x", "Senhora");
        //concatenar como se fosse adicionar    no final ele ficou "BOM DIA SENHORA!!!"
        s.concat("!!!");
        
        System.out.println(s); 
        System.out.println("leo".toUpperCase());

        String x = "leo".toUpperCase();
        System.out.println(x);

        String y = "bom dia x".replace("x", "gui").toUpperCase().concat("!!!");
        System.out.println(y);
    }
}
