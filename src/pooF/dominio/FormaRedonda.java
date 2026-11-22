package pooF.dominio;

public abstract class FormaRedonda extends Forma{
    protected double raio;

    public FormaRedonda(String nome, double raio){
        super(nome);
        this.raio = raio;
    }
}
