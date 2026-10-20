package exercicios;

public class ComparacaoIdades {
    public static void main (String [] args){
        int idadeVictor = 19;
        int idadeAmigo = 17;
        String isMaisVelho = "Victor é mais velho que o amigo";
        String isMaisNovo = "Victor é mais novo que o amigo";
        if (idadeVictor == idadeAmigo){
            System.out.println("Victor tem a mesma idade  do Amigo");
        }
        else {
            String resultado = (idadeVictor > idadeAmigo ? isMaisVelho : isMaisNovo);
            System.out.println(resultado);
        }
        if (idadeAmigo != idadeVictor){
            System.out.println("A idade dos dois são diferentes");
        }
        if (idadeVictor >= 18){
            System.out.println("Victor tem 18 anos ou mais");
        }
        if (idadeAmigo >=17){
            System.out.println("Amigo tem 17 anos ou mais");
        }



    }
}
// operador ternario (condicao) ? verdadeiro : falso;