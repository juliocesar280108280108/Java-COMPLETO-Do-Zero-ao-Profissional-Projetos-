package classe;

public class Dataa {
    int dia;
    int mes;
    int ano;

    Dataa(){
     dia = 1; 
     mes = 1;
     ano = 1970;
    }

    Dataa(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;

    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes , ano);
    }
        
    

    void imprimirDataFormada(){
        System.out.println(obterDataFormatada());
    }
}
