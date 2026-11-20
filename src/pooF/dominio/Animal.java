package pooF.dominio;

public abstract class Animal {
    protected String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public abstract void emitirSom();

    
    public  void apresentar(){
        System.out.println("Eu sou o "+ this.nome);
        emitirSom();

    }

}
