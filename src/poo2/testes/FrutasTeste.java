package poo2.testes;

import poo2.dominio.Frutas;

public class FrutasTeste {
    static void main(String[] args) {
        Frutas fruta01 = new Frutas("Morango");
        Frutas fruta02 = new Frutas("Laranja");
        Frutas fruta03 = new Frutas("Limão");
        Frutas[] frutas = new Frutas[]{fruta01, fruta02,fruta03};

        for (Frutas sacolao : frutas){
            sacolao.imprimir();
        }
    }
}
