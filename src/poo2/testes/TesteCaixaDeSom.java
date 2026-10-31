package poo2.testes;

import poo2.dominio.CaixaDeSom;

public class TesteCaixaDeSom {

    static void main(String[] args) {
        CaixaDeSom caixaDeSom = new CaixaDeSom();

        caixaDeSom.ligar();
        caixaDeSom.setVolume(100);
        caixaDeSom.exibirCaixaDeSom();
        System.out.println(caixaDeSom.getVolume());



    }
}
