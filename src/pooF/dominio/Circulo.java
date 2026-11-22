package pooF.dominio;

public class Circulo extends FormaRedonda{
    public Circulo(double raio) {
        super("Circulo", raio);
    }

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }
}
