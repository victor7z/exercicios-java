package pooB.dominio;

public class Livro {
    private String titulo;
    private Biblioteca biblioteca;

    public void imprime(){
        System.out.println(this.titulo);
        if (biblioteca != null){
            System.out.println(biblioteca.getNome());

        }
    }

    public Livro(String titulo){
        this.titulo = titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
}
