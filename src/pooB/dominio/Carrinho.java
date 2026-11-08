package pooB.dominio;

public class Carrinho {
    private double[] precos;

    public Carrinho(double[] precos){
        this.precos = precos;
    }

    public void exibirPrecos(){
        for (int i = 0; i < this.precos.length; i++) {
            System.out.println("Precos: "+ precos[i]);
        }
    }
}
