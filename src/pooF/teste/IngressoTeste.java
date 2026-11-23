package pooF.teste;


import pooF.dominio.CalculadoraTaxa;
import pooF.dominio.Cinema;
import pooF.dominio.Show;

public class IngressoTeste {
    static void main(String[] args) {
        Cinema cinema = new Cinema("Filme ação", 40);
        Show show = new Show("Banda Gospel", 200);

        CalculadoraTaxa.relatorioTaxaCinema(cinema);
        System.out.println();
        CalculadoraTaxa.relatorioTaxaShow(show);

    }
}
