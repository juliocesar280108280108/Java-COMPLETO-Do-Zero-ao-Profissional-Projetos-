package herança.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(60);
         
        Arroz ingrediente1 = new Arroz(2.5);
        Sorvete ingrediente2 = new Sorvete(0.500);
        Feijao ingrediente3 = new Feijao(5);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);

        System.out.println(convidado.getPeso());

    }
}
