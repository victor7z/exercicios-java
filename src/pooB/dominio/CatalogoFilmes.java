package pooB.dominio;

public class CatalogoFilmes {

    private String[][] filmes = {
            {"Shrek", "Era do Gelo"},
            {"Interestelar", "Wall-E", "De Volta para o Futuro"},
            {"Coraline"}
    };

    public void exibirFilmes(){
        int contador = 1;
        for (String[] categoria : this.filmes){
            System.out.println("Categoria: "+ (contador++) );
            for (String filme : categoria){
                System.out.println("Filme: "+ filme);

            }
        }


    }




}
