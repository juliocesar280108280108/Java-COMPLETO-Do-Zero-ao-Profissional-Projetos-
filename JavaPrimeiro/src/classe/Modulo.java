package classe;

public class Modulo {
    String nomeP;
    double pesoP;
    String nomeC;
    Double pesoC;

    Modulo(String nomeInicialP, double pesoInicialP, String nomeIncialC, double pesoInicialC ){
        nomeP = nomeInicialP;
        pesoP = pesoInicialP;
        nomeC = nomeIncialC;
        pesoC = pesoInicialC;
    }

    double pesoSubitraido(){
        return pesoP + pesoC;
    }



}
