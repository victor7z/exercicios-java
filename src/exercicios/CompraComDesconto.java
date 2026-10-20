package exercicios;

public class CompraComDesconto {
    static void main(String[] args) {
        double precoProduto = 80;
        int quantidade = 3;
        boolean temCupom = true;
        double pagamentoRecebido = 205;
        double subtotal = precoProduto * quantidade;
        double desconto = 0;
        double total = 0;
        double faltaPagar = 0;
        double saldoRestante = 0;

        if (temCupom){
            desconto = subtotal * 0.15;

        }
        total = subtotal - desconto;
        System.out.println("Preço do Produto: "+ precoProduto);
        System.out.println("Subtotal: "+ subtotal);
        System.out.println("exercicios.Desconto "+ desconto);
        System.out.println("Total: "+ total);
        if  (pagamentoRecebido >= total){
            System.out.println("Compra Aprovada");
            saldoRestante = pagamentoRecebido - total;
            System.out.println("Saldo Restantem: "+ saldoRestante);
        }
        else {
            System.out.println("Compra Negada");
            System.out.println("Saldo insuficiente");
            faltaPagar = total - pagamentoRecebido;
            System.out.println("Falta pagar: "+ faltaPagar);

        }

    }
}
