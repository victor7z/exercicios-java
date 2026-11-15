package pooD.teste;


import pooD.dominio.Produto;

import java.util.Scanner;

public class ProdutoTeste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do Produto:");
        String nome = input.nextLine();

        System.out.print("Preço do Produto:");
        double preco = input.nextDouble();

        System.out.print("Quantidade do Produto:");
        int quantidade = input.nextInt();

        Produto produto1 = new Produto(nome,preco,quantidade);
        produto1.exibirDados();
    }
}
