package pooD.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotal(){
        return preco * quantidade;
    }

   public void exibirDados(){
       System.out.println("============");
       System.out.println("Nome do Produto: "+ this.nome);
       System.out.println("Preço do Produto: "+ this.preco);
       System.out.println("Quantidade do Produto: "+ this.quantidade);
       System.out.println("Valor total: "+ valorTotal());
   }

}
