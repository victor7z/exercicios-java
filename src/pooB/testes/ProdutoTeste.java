package pooB.testes;

import pooB.dominio.Produto;

public class ProdutoTeste {
    static void main(String[] args) {
        Produto produto1 = new Produto("mouse",600, 5);
        Produto produto2 = new Produto("Teclado",400, 10);


        System.out.println(produto1.calcularDesconto());
        System.out.println(produto2.calcularDesconto());
    }
}
