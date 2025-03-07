package fundamentos_variaveis_constantes;

public class tiposprimitivos {
    public static void main(String[] args) {
        byte AnosDeEmpresa = 23;
        short NumerosDeVoos = 542;
        int id = 56789;
        long PontosAcumulados = 3_234_231_411L;

        float salario = 11_445.44f;
        double vendas = 5.000000;

        boolean estaDeFerias = false;

        //caracteristica exemplo "A" de ativo e um stado e status
        char status = 'a'; //ativo

        //caucular todos os dias da empresa usando as variaveis ja criada
        //dias da empresa

        System.out.println(AnosDeEmpresa*365);
        //numeros de viagem
        System.out.println(NumerosDeVoos/2);
        //pontos acumulados(pontos por real)
        System.out.println(PontosAcumulados/vendas);

        System.out.println(id + ": ganha " + salario);
        System.out.println("ferias?" + estaDeFerias);
        System.out.println("ele esta:" + status);

    }
}
