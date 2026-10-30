package poo.testepoo;

import poo.Impressora;

public class TestarImpressora {
    static void main(String[] args) {
        Impressora impressora01 = new Impressora();

        impressora01.modelo = "EPSON";
        impressora01.totalDeFolhas = 10;
        impressora01.statusDaImpressora();
        impressora01.imprimir(10);
        System.out.println("==========");
        impressora01.statusDaImpressora();



    }
}
