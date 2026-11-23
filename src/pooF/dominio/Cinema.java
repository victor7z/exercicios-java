package pooF.dominio;

public class Cinema extends Ingressos{
    public static final double TAXA_POR_CENTO = 0.10;

    public Cinema(String evento, double preco) {
        super(evento,preco);
    }

    @Override
    public double calcularTaxa(){
        System.out.println("Calculando taxa do cinema");
        return preco * TAXA_POR_CENTO;
    }
}
