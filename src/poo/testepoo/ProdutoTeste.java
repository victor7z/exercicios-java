package poo.testepoo;

import poo.Produto1;

public class ProdutoTeste {
    static void main(String[] args) {
        Produto1 produto1 = new Produto1();
        Produto1 produto12 = new Produto1();

        produto1.nome = "Teclado";
        produto1.preco = 150.00;
        produto1.quantidade = 10;

        produto12.nome = "Mouse";
        produto12.preco = 80.00;
        produto12.quantidade = 0;

        System.out.println("======== TECLADO ===========");
        System.out.println("Valor do estoque: "+ produto1.calcularValorEstoque());
        System.out.println("Disponivel: "+ produto1.verificarEstoque());
        System.out.println("Preço com Desconto: "+ produto1.calcularPrecoComDesconto(0.20));
        System.out.println("Preço Original: "+ produto1.preco);

        System.out.println("======== MOUSE ==============");
        System.out.println("Valor do Estoque: "+ produto12.calcularValorEstoque());
        System.out.println("Disponível: "+ produto12.verificarEstoque());

    }
}
