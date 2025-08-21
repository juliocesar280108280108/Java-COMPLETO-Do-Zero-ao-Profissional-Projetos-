package classe;

public class Dataa {
    int dia;
    int mes;
    int ano;

    Dataa(){
     this(1,1,1970);
    }

    Dataa(int dia, int mesInicial, int anoInicial){
        this.dia = dia;
        this.mes = mesInicial;
        this.ano = anoInicial;

    }

    String obterDataFormatada(){
     final String formato = "%d/%d/%d";
        return String.format(formato, this.dia, this.mes , this.ano);
    }
        
    

    void imprimirDataFormada(){
        
        System.out.println(this.obterDataFormatada());
    }
}
