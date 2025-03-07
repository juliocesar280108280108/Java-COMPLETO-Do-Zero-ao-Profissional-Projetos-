package operadores;

public class ternario {
    public static void main(String[] args) {
        double media = 5.6;
        String ResultadoParcial = media >= 5.0? "recuperçao" : "reprovado";
        String  ResultadoFinal = media >= 7.0 ? "Aprovado" : ResultadoParcial;
        System.out.println("o aluno esta: " + ResultadoFinal);

        double nota = 7.9;
        boolean BomComportamento = true;
        boolean PassouPorMedia = nota >=7;
        boolean desconto = BomComportamento && PassouPorMedia;
        String resultado =  desconto ? "sim":"nao";
        System.out.println("tem desconto? " + resultado);

    }
}
