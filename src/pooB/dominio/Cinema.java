package pooB.dominio;

public class Cinema {
    private String[][] filmes;
    private String nomeCategoria;

    public Cinema(String[][] filmes) {
        this("Favoritos", filmes);

    }

    public Cinema(String nomeCategoria, String[][] filmes){
        this.nomeCategoria = nomeCategoria;
        this.filmes = filmes;
    }

    public void exibirFilmes(){
        System.out.println("Categoria: "+this.nomeCategoria);
        for (int i = 0; i < filmes.length; i++) {
            System.out.println("Categoria: "+ (i+1));
            for (int j = 0; j < filmes[i].length; j++) {
                System.out.println("Filmes"+ (j+1) +": "+ this.filmes[i][j]);
            }
        }
    }
}
