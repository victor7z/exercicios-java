package pooF.dominio;

public class Imposto implements Calculadora{

    @Override
    public double calcularValor(double valor) {
        return valor * TAXA;
    }
}
