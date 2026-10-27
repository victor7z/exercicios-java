package poo.testepoo;

import poo.SistemaDescontos;

public class TesteSistemaDesconto {
    static void main(String[] args) {
        SistemaDescontos cliente1 = new SistemaDescontos();

        cliente1.nomeCliente = "Victor";
        cliente1.valorDaCompra = 600;

        cliente1.notaFiscal();
    }
}
