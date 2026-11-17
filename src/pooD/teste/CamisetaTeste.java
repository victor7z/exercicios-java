package pooD.teste;

import pooD.dominio.Camiseta;
import pooD.dominio.Cor;

public class CamisetaTeste {
    static void main(String[] args) {
        Camiseta camiseta01 = new Camiseta("nike",100, Cor.PRETO);

        System.out.println(camiseta01);
        camiseta01.exibirMarca();
    }
}
