package poo2.testes;

import poo2.dominio.Perifericos;

public class PerifericosTeste {
    static void main(String[] args) {
        Perifericos periferico1 = new Perifericos("Teclado");
        Perifericos periferico2 = new Perifericos("mouse");
        Perifericos[] perifericos = new Perifericos[]{periferico1,periferico2};

        for (Perifericos periferico : perifericos){
            periferico.imprime();
        }
    }
}
