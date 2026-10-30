package poo.testepoo;

import poo.Dispositivo;

public class TestarDispositivo {
    static void main(String[] args) {
        Dispositivo dispositivo1 = new Dispositivo();

        dispositivo1.definirNome("Notebook");
        dispositivo1.bateria = 50;

        dispositivo1.carregar(70);
        dispositivo1.usar(10,15,5);
        dispositivo1.usar(80);

        dispositivo1.exibirDados();
    }
}
