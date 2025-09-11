package herança.desafio_carro;

public interface Luxo {
    public void ligarAr();
    abstract void desligarAr();

    default int nivelDoAr(){
        return 1;
    }
}
