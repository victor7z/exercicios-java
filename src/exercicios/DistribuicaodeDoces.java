package exercicios;

public class DistribuicaodeDoces {
    public static void main (String[] args){
        int quantDoces = 23;
        int quantCriancas = 5;
        int quantDocePorCrianca;
        int quantDocesSobram;

        quantDocePorCrianca = quantDoces / quantCriancas;
        quantDocesSobram = quantDoces % quantCriancas;

        System.out.println("Quantidade De Doces Que Cada Crianca Vai Receber: "+ quantDocePorCrianca);
        System.out.println("Quantidade De Doces Que Vão Sobrar: "+ quantDocesSobram);



    }
}
