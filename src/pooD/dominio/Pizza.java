package pooD.dominio;

public class Pizza {
    private String sabor;
    private Tamanho tamanho;

    public Pizza(String sabor, Tamanho tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    public void exibirDados(){
        System.out.println("Sabor: "+ this.sabor);
        System.out.println("Tamanho: "+ this.tamanho);
        System.out.println("Fatias: "+ tamanho.getFatias());
    }
}
