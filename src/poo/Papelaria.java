package poo;

public class Papelaria {
    public String produto;
    public double preco;
    public int quantidadeEstoque;

    public void exibir(){
        System.out.println("Produto: "+ produto);
        System.out.println("Preço: "+ preco);
        System.out.println("Quantidade Em Estoque: "+quantidadeEstoque);
    }

    public boolean verificarDisponibilidade(int quantidadeDesejada){
        if (quantidadeDesejada > 0 && quantidadeDesejada <= quantidadeEstoque){
            return true;
        }
        return false;
    }

    public void vender (int quantidadeVendida){
        if (verificarDisponibilidade(quantidadeVendida)){
            quantidadeEstoque -= quantidadeVendida;
            System.out.println("Venda Realizada com Sucesso!");
            return;
        }
        System.out.println("Venda não Realizada por falta de Estoque!");

    }

    public void reporEstoque(int reporProduto){
        if (reporProduto >0){
            quantidadeEstoque += reporProduto;
            return;
        }
        System.out.println("Escolha outro valor");
    }





}
