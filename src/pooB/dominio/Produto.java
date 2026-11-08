package pooB.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    private static double desconto = 10;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;

    }

    public double calcularDesconto(){
        double valorDesconto = preco * desconto / 100;
        return preco - valorDesconto;
    }

    public void vender(int quantidade){
        if (quantidade > 0 && quantidade <= estoque){
            estoque -= quantidade;
            System.out.println("Venda realizada com sucesso");
        }else if (quantidade > estoque){
        System.out.println("Estoque insuficiente!");
        }else{
        System.out.println("Quantidade invalida!");
        }

    }
}
