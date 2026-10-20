package poo.testepoo;

import poo.Papelaria;

public class PapelariaTeste {
    static void main(String[] args) {
        Papelaria produto1 = new Papelaria();
        Papelaria produto2 = new Papelaria();

        produto1.produto = "Lápis";
        produto1.preco = 1.50;
        produto1.quantidadeEstoque = 10;

        produto2.produto = "Borracha";
        produto2.preco = 2;
        produto2.quantidadeEstoque = 5;

        System.out.println("============= PRODUTO 1 =================");
        produto1.exibir();
        if (produto1.verificarDisponibilidade(5)){
            System.out.println("Produto Disponnível em Estoque");
        }
        else {
            System.out.println("Produto em falta");
        }
        produto1.vender(10);
        System.out.println("Estoque Atualizado: "+ produto1.quantidadeEstoque);

        System.out.println("============= PRODUTO 2 =================");
        produto2.exibir();
        if (produto2.verificarDisponibilidade(6)){
            System.out.println("Produto Disponnível em Estoque");
        }
        else {
            System.out.println("Produto em falta");
        }

    }
}
