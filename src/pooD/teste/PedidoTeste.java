package pooD.teste;

import pooD.dominio.FormaDePagamento;
import pooD.dominio.Pedido;

public class PedidoTeste {
    static void main(String[] args) {
        Pedido pedido1 = new Pedido("Pedido 1", 100, FormaDePagamento.DINHEIRO);
        Pedido pedido2 = new Pedido("Pedido 1", 100, FormaDePagamento.CARTAO);
        Pedido pedido3 = new Pedido("Pedido 1", 100, FormaDePagamento.PIX);

        pedido1.exibirDados();
        System.out.println();
        pedido2.exibirDados();
        System.out.println();
        pedido3.exibirDados();


    }
}
