package pooB.dominio;

public class LojaCelular {
    private String nome;

    public LojaCelular(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
