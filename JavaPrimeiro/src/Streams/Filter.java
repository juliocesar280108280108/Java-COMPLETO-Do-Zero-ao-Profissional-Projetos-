package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("bia", 6.8);
        Aluno a3 = new Aluno("daniel", 8.8);
        Aluno a4 = new Aluno("biel", 4.8);
        Aluno a5 = new Aluno("julio", 3.8);
        Aluno a6 = new Aluno("Luisa", 2.8);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

        Predicate<Aluno> aprovados = a -> a.nota>=7;
        Function<Aluno,String> apv = a -> "parabens " + a.nome + " vc foi aprovado$$$$";
        Predicate<Aluno> reprovados = a -> a.nota<=6.9;
        Function<Aluno,String> rec = a -> "infelizmente " + a.nome + " vc foi reprovado&&&&";

        alunos.stream().filter(aprovados).map(apv).forEach(System.out::println);
        alunos.stream().filter(reprovados).map(rec).forEach(System.out::println);
        System.out.println("\n");
        

        alunos.stream().filter(a -> a.nota >= 7).map(a -> "Parabes " + a.nome + " Voce foi aprovada!!!").forEach(System.out::println);
        alunos.stream().filter(a -> a.nota <=6.9).map(a -> "infelizmente voce " + a.nome + " foi reprovada " ).forEach(System.out::println);
    }
}
