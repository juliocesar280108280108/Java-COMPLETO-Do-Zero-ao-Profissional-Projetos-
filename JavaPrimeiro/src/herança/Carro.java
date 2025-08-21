package herança;

public class Carro {
    int vlAtual = 50;
    int f;
    int c;
     
    void acelerar(){
        vlAtual += 5;
    }

    void freiar(){
        if (vlAtual >= 5) {
            vlAtual -=5;
        }else{
            vlAtual =0;
        }
        }


         public String toString(){
            return "Velocidade atual é: " +vlAtual + "km/h";
    }
}
