package pooF.teste;

import pooF.dominio.ImpressoraSimples;
import pooF.dominio.Multifuncional;

public class ImpressoraTeste {
    static void main(String[] args) {
        Multifuncional multifuncional = new Multifuncional();
        ImpressoraSimples impressoraSimples = new ImpressoraSimples();

        multifuncional.imprimir("contrato.pdf");
        multifuncional.escanear("contrato.pdf");
        impressoraSimples.imprimir("contrato.pdf");
        impressoraSimples.imprimirCopia("contrato.pdf");
        multifuncional.imprimirCopia("contrato.pdf");
    }
}
