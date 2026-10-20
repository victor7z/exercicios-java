package poo;

public class Produto1 {
    public String nome;
    public double preco;
    public int quantidade;

    public double calcularValorEstoque(){
        return preco * quantidade;
    }
    public boolean verificarEstoque(){
        if (quantidade >0){
            return true;

        }
        return false;

    }
    public double calcularPrecoComDesconto(double desconto){
        desconto *= preco;
        return preco - desconto;
    }

}
