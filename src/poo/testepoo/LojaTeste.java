package poo.testepoo;

import poo.Produto;

public class LojaTeste {
    static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Teclado";
        produto1.codigo = 101;
        produto1.preco = 150.00;
        produto1.quantidade = 10;

        produto2.nome = "Mouse";
        produto2.codigo = 102;
        produto2.preco = 80.00;
        produto2.quantidade = 5;

        System.out.println("======== PRODUTO 1 ==============");
        produto1.exibirDados();
        System.out.println("Valor do Estoque: "+ produto1.calcularValorEstoque());
        System.out.println("Preço com Desconto: "+produto1.calcularDesconto(20));
        produto1.vender(3);
        System.out.println("===============");
        produto1.exibirDados();


        System.out.println("======== PRODUTO 2 ==============");
        produto2.exibirDados();
        System.out.println("Valor do Estoque: "+ produto2.calcularValorEstoque());
        System.out.println("Preço com Desconto: "+produto2.calcularDesconto(20));
        produto2.vender(10);
        produto2.reporEstoque(8);
        produto2.vender(6);
        System.out.println("===============");
        produto2.exibirDados();
    }
}
