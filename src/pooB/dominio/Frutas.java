package pooB.dominio;

public class Frutas {
    private String nome;


    public void imprimir(){
        System.out.println(this.nome);
    }

    public Frutas(String nome){
        this.nome = nome;
    }
}
