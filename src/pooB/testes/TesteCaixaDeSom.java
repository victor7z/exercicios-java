package pooB.testes;

import pooB.dominio.CaixaDeSom;

public class TesteCaixaDeSom {

    static void main(String[] args) {
        CaixaDeSom caixaDeSom = new CaixaDeSom();

        caixaDeSom.ligar();
        caixaDeSom.setVolume(100);
        caixaDeSom.exibirCaixaDeSom();
        System.out.println(caixaDeSom.getVolume());



    }
}
