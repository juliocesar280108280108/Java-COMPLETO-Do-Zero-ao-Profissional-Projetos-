package herança.Abstrato;

public abstract class Cachorro extends Mamifero {
    
    @Override
    public String mover() {
        return "usando as patas";
    }

    @Override
    public String mamar() {
        return "usando leite";
    }
}
