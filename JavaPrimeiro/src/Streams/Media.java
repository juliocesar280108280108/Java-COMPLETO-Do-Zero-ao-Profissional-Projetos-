package Streams;

public class Media {
    private double total;
    private int quantidade;

   public Media adicionar(double valor) {
    this.total += valor;
    this.quantidade++;
    return this; // retorna a própria instância para o reduce continuar
}


    public double getValor(){
        return total/ quantidade;
    }

    public static Media combinar(Media m1, Media m2){
        Media resultante = new Media();
        resultante.total = m1.total +m2.total;
        resultante.quantidade = m1.quantidade + m2.quantidade;
        return resultante;

    }
}
