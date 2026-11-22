package pooF.dominio;

public class Retangulo extends Forma{
    private double base;
    private double altura;


    public Retangulo(String nome, double base, double altura){
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return this.base * this.altura;
    }
}
