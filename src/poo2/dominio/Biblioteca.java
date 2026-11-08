package poo2.dominio;

public class Biblioteca {
    private String nome;

    public Biblioteca(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

}
