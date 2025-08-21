package oocomposicao;

 public class Carroteste{
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelera();
        c1.acelera();
        c1.acelera();
        c1.acelera();
        c1.acelera();

        System.out.println(c1.motor.giros());

        c1.freia();
        c1.freia();
        c1.freia();
        c1.freia();
        c1.freia();

        System.out.println(c1.motor.giros());

    }

 }