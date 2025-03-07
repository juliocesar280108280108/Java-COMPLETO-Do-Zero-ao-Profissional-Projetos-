package fundamentos_variaveis_constantes;

public class tiposString {
    public static void main(String[] args) {
        System.out.println("ola pessoal".charAt(2));

        String s = "boa tarde"; 
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        //starswith e para saber se a String começa com a tal palavara "???"
        System.out.println(s.startsWith("boa"));

        //toLowCase e para a starswith ignorar se caso a tal palavra esteja mauscula ou minuscola "b" ou "B"
       System.out.println(s.startsWith("Boa".toLowerCase()));

       //para saber como a string termina falso ou verdadeira
       System.out.println(s.endsWith("Tarde".toLowerCase()));

        //equals e a mesma funçao mas tem o ignorecase fazendo com q n precise utilizar toLowCase
       System.out.println(s.equalsIgnoreCase("boa Tarde"));

       //saber quantas caracteris tem uma String
       System.out.println(s.length());

       var nome = "pedro";
       var sobrenome = "Santos";
       var idade = 17;
       var salario = 12345.987F;
       System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nidade: " + idade + "\nsalario: " + salario); 

       //o out.printf e possivel colocar %s para string no caso escrito e %d para numeros inteiros e %f para numeros duble numeros nao inteiros podendendo subistiur as variaveis criadas
       System.out.printf("senhor %s %s tem %d e recebe R$%.3f", nome,sobrenome,idade, salario);
        // vc tbm pode colocar essa frase no string.format dentro de uma variavel e vc tbm pode colocar ."algum valor de casas apos o primeiros numeros" ex: .3f = 1234.567 e se fosse .2f = 1234.56
       String frase = String.format("senhor %s %s tem %d e recebe R$%.3f", nome,sobrenome,idade, salario);
       System.out.println(frase);
      
        // a .contains para ver se esssa palavra tem na frase mostrando se e true ou false
       System.out.println("frase qualquer".contains("qual"));
       //a indexOf para ver e que posiçao começa essa letra ou palavra
       System.out.println("frase qualquer".indexOf("qual"));
       // a substring ela coloca a primeira letra e se colocar uma virgula e colocar outro numero vai ate esse numero
       System.out.println("frase qualquer".substring(6));
       System.out.println("frase qualquer".substring(6,9));

       
       
    }
}
