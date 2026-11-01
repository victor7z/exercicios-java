package poo2.testes;

import poo2.dominio.Campeonato;

public class CampeonatoTeste {
    static void main(String[] args) {
        Campeonato campeonato01 = new Campeonato();

        int[][] campeonato = {
                {10,15},{20,5,12},{8}
        };

        campeonato01.setPontos(campeonato);
        campeonato01.exibirPontos();
        System.out.println("Total de rodadas: "+ campeonato01.getPontos().length);
    }


}
