package classe;

public class Areacirc {
    double raio;
    double pi = 3.14;
    Areacirc(double raiInicial){
       
        raio = raiInicial;
    }

    Double area(){
        return pi* Math.pow(raio, 2);
    }

}
