package pooF.dominio;

public class CalculadoraTaxa {
    public static void relatorioTaxaCinema(Cinema cinema){
        System.out.println("Relatorio Cinema:");
        System.out.println(cinema.getEvento());
        System.out.println(cinema.getPreco());
        System.out.println(cinema.calcularTaxa());
    }

    public static void relatorioTaxaShow(Show show){
        System.out.println("Relatorio Show:");
        System.out.println(show.getEvento());
        System.out.println(show.getPreco());
        System.out.println(show.calcularTaxa());
    }
}
