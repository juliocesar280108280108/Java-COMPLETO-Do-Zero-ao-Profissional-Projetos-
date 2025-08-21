package herança;

public class CarroTeste {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        ferrari.f = 50;
        

        Civic civic = new Civic();
        civic.c = 50;


        System.out.println("a velocidade atual da Ferrari: " + ferrari.vlAtual + "km/h");
        System.out.println("a velocidade atual do Civic: " + civic.vlAtual + "km/h");

    }
}
