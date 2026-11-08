package pooB.testes;

import pooB.dominio.Predio;

public class PredioTeste {
    static void main(String[] args) {
        Predio predio01 = new Predio();

        String[][] salas = {
                {"RECEPÇÃO", "REUNIÃO"}, {"DESENVOLVIMENTO", "SUPORTE", "TESTES"}, {"DIRETORIA"}
        };

        predio01.setSalas(salas);
        predio01.exibirSalas();
        System.out.println("Total de andares: "+ predio01.getSalas().length);
    }
}
