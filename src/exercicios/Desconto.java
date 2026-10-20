package exercicios;

public class Desconto {
    static void main(String[] args) {
        double valorCompra= 180;
        double pagamentoRecebido= 200;
        double desconto = 0;
        double total = 0;

        if (valorCompra >= 300){
            desconto = valorCompra * 0.2;
        }
        else if (valorCompra >=150 && valorCompra <300){
            desconto = valorCompra * 0.1;
        }
        total = valorCompra - desconto;
        if (pagamentoRecebido >= total){
            System.out.println("Compra Aprovada");

        }
        else {
            System.out.println("Compra Negada");
        }
        System.out.println("Valor Da Compra: "+ valorCompra);
        System.out.println("Pagamento Recebido: "+ pagamentoRecebido);
        System.out.println("exercicios.Desconto: "+ desconto);
        System.out.println("Total: "+ total);

    }
}
