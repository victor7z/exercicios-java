package exercicios;

public class Passagem {
    static void main(String[] args) {
        int tipoTransporte = 2;
        int quantidadePassagem = 3;
        double precoPassagem = 0;
        double total = 0;
        String transporte = "";

        switch(tipoTransporte){
            case 1:
                transporte = "Onibus";
                precoPassagem = 5 ;
                total = precoPassagem * quantidadePassagem;
                System.out.println(transporte);
                System.out.println("Preço da exercicios.Passagem: "+ precoPassagem);
                System.out.println("Quantidade de exercicios.Passagem: "+ quantidadePassagem);
                System.out.println("Total: "+ total);
                break;

            case 2:
                transporte = "Metro";
                precoPassagem  = 6;
                total = precoPassagem * quantidadePassagem;
                System.out.println(transporte);
                System.out.println("Preço da exercicios.Passagem: "+ precoPassagem);
                System.out.println("Quantidade de exercicios.Passagem: "+ quantidadePassagem);
                System.out.println("Total: "+ total);
                break;


            case 3:
                transporte = "Trem";
                precoPassagem = 4.50;
                total = precoPassagem * quantidadePassagem;
                System.out.println(transporte);
                System.out.println("Preço da exercicios.Passagem: "+ precoPassagem);
                System.out.println("Quantidade de exercicios.Passagem: "+ quantidadePassagem);
                System.out.println("Total: "+ total);
                break;

            default:
                System.out.println("Escolha inválida");
        }
    }
}
