package pooF.dominio;

public abstract class Forma {
    protected String nome;

    public Forma(String nome){
        this.nome = nome;
    }

    public abstract double calcularArea();

    public void exibirArea(){
        System.out.println("Nome: "+ nome+ " Area: "+calcularArea());
    }
}
