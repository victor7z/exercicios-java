package poo2.testes;

import poo2.dominio.Jogador;
import poo2.dominio.Time;

public class JogadorTeste {
    static void main(String[] args) {
        Jogador jogador01 = new Jogador("Neymar");
        Time time = new Time("Seleção Brasileira");
        jogador01.setTime(time);

        jogador01.imprimir();
    }
}
