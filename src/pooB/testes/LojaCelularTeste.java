package pooB.testes;

import pooB.dominio.Celular;
import pooB.dominio.LojaCelular;

public class LojaCelularTeste {
    static void main(String[] args) {
        Celular celular1 = new Celular("Apple");
        LojaCelular filial1 = new LojaCelular("Filial 1");

        celular1.setFilial(filial1);
        celular1.imprimir();
    }
}
