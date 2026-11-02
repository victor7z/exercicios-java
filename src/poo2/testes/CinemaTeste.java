package poo2.testes;

import poo2.dominio.Cinema;

public class CinemaTeste {
    static void main(String[] args) {
        String[][] filmes = {
                {"Shrek", "A era do Gelo"},{"Interestelar", "Wal-e"}
        };

        Cinema cinema01 = new Cinema(filmes);
        Cinema cinema02 = new Cinema("ação", filmes);

        cinema01.exibirFilmes();
        System.out.println("===========");
        cinema02.exibirFilmes();

    }
}
