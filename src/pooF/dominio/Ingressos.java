package pooF.dominio;

public abstract class Ingressos implements Cobravel{
    protected String evento;
    protected double preco;

    public Ingressos(String evento, double preco) {
        this.evento = evento;
        this.preco = preco;
    }

    public String getEvento() {
        return evento;
    }

    public double getPreco() {
        return preco;
    }
}
