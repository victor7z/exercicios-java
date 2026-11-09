package pooC.testes;

import pooC.dominio.Jogador;
import pooC.dominio.Time;

import java.util.Scanner;

public class TimeTeste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE O NOME DO TIME: ");
        String nomeTime = input.nextLine();


        Time time1 = new Time(nomeTime);

        time1.exibirDados();
        System.out.println("==========");

        System.out.println("DIGITE O NOME DO JOGADOR 1:");
        String jogador1Nome = input.nextLine();


        Jogador jogador1 = new Jogador(jogador1Nome, 7);
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
