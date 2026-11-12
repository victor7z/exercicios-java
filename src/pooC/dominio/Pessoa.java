package pooC.dominio;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome){
        System.out.println("Construtor de Pessoa");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
    }
}
