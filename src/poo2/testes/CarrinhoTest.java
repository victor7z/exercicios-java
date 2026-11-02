package poo2.testes;

import poo2.dominio.Carrinho;

public class CarrinhoTest {
    static void main(String[] args) {
        double[] precos = {10.0, 20.0, 30.0};

        Carrinho carrinho01 = new Carrinho(precos);
        carrinho01.exibirPrecos();
    }
}
