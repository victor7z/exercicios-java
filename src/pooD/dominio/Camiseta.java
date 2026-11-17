package pooD.dominio;

public class Camiseta {
    private String modelo;
    private final double preco;
    private Cor cor;
    public static final String MARCA = "DevWear";

    public Camiseta (String modelo, double preco ,Cor cor){
        this.cor = cor;
        this.modelo = modelo;
        this.preco = preco;
    }

    public void exibirMarca(){
        System.out.println(MARCA);
    }

    @Override
    public String toString() {
        return "Camiseta{" + "Modelo='" + this.modelo + '\'' + ", Preco=" + this.preco + ", Cor=" + cor.getDescricao() + '}';
    }
}
