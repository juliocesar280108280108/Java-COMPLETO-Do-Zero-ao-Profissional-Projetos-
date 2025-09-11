package herança.desafio_carro;

public class Carro {
    int vlMaxima;
    int vlAtual = 50;
    int f;
    int c;
    int delta = 5;
     
    protected Carro(int velocidadeMaxima){
        vlMaxima = velocidadeMaxima;
    }


    
    
    public void acelerar(){
        if (vlAtual + delta > vlMaxima) {
            vlAtual = vlMaxima;
        }
        else{
            vlAtual += delta;
        }
        vlAtual += delta;
    }

    public void freiar(){
        if (vlAtual >= delta) {
            vlAtual -=delta;
        }else{
            vlAtual =0;
        }
        }


         public String toString(){
            return "Velocidade atual é: " +vlAtual + "km/h";
    }

         public int getDelta() {
             return delta;
         }

         public void setDelta(int delta) {
             this.delta = delta;
         }

    
}
