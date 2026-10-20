package exercicios;

public class DivisaoDeConta {
    public static void main (String[] args){
        int quantidaDePessoas = 4;
        double valorPizza = 59.90;
        double valorBebidas = 18.50;
        double descontos = 10.00;
        double subtotal = 0;
        double total = 0;
        double totalDivdidoPorPessoa ;

        subtotal = valorBebidas + valorPizza;
        total = subtotal - descontos;
        totalDivdidoPorPessoa = total / quantidaDePessoas;

        System.out.println("Valor da pizza: "+valorPizza);
        System.out.println("Valor da bebidas: "+valorBebidas);
        System.out.println("Quantidade De pessoas: "+quantidaDePessoas);
        System.out.println("Subtotal: "+subtotal);
        System.out.println("exercicios.Desconto: "+ descontos);
        System.out.println("Total: "+ total);
        System.out.println("Valor Dividido Para 4 pessoas: "+ totalDivdidoPorPessoa);

    }
}
