package pooF.dominio;

public class Show extends Ingressos{
    public static final double TAXA_POR_CENTO = 0.25;

    public Show(String evento, double preco) {
        super(evento, preco);
    }

    @Override
    public double calcularTaxa(){
        System.out.println("Calculando taxa do show");
        return preco * TAXA_POR_CENTO;
    }
}
