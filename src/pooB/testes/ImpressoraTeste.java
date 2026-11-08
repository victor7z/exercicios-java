package pooB.testes;

import pooB.dominio.Impressora;

public class ImpressoraTeste {
    static void main(String[] args) {
        Impressora impressora01 = new Impressora("Epson");
        Impressora impressora02 = new Impressora("HP");
        impressora01.imprimir(0);
        impressora01.imprimir(25);
        impressora01.imprimir(20);
        impressora01.imprimir(15);


    }

}
