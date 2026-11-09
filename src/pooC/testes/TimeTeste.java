package pooC.testes;

import pooC.dominio.Jogador;
import pooC.dominio.Time;

public class TimeTeste {
    static void main(String[] args) {
        Time time1 = new Time("Tigres FC");

        time1.exibirDados();
        System.out.println("==========");

        Jogador jogador1 = new Jogador("Cristiano Ronaldo", 7);
        Jogador jogador2 = new Jogador("Lionel Messi", 10);
        Jogador jogador3 = new Jogador("Neymar JR", 10);
        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};
        Time[] times = new Time[]{};

        time1.setJogadores(jogadores);


        time1.exibirDados();
        System.out.println("===========");
        jogador1.exibirDados();
    }
}
