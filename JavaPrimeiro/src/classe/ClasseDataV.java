package classe;

public class ClasseDataV {
    int dia;
    int mes;
    int ano;

    ClasseDataV(){
     dia = 1; 
     mes = 1;
     ano = 1970;
    }

    ClasseDataV(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;

    }

    String obterDataFormatada(){
        return String.format("%d%f%d", dia, mes , ano);
    }
        
    

    void imprimirDataFormada(){
        System.out.println(obterDataFormatada());
    }
}
