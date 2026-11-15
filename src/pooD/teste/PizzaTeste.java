package pooD.teste;

import pooD.dominio.Pizza;
import pooD.dominio.Tamanho;

public class PizzaTeste {
    static void main(String[] args) {
        Pizza pizza1 = new Pizza("Frango", Tamanho.GRANDE);
        Pizza pizza2 = new Pizza("Carne Seca", Tamanho.PEQUENO);

        pizza1.exibirDados();
        System.out.println("==========");
        pizza2.exibirDados();
    }
}
