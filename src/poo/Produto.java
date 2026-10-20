package poo;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;
    public int codigo;

    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+ preco);
        System.out.println("Quantidade: "+ quantidade);
        System.out.println("Código do Produto: "+ codigo);
    }

    public double calcularValorEstoque(){
        return (preco*quantidade);
    }
    public boolean verificaDisponibilidade(int quantidadeDesejada){
        if ( quantidadeDesejada <= quantidade && quantidadeDesejada >0){
            return true;
        }
        return false;
    }
    public double calcularDesconto(double porcentagem){
        porcentagem = porcentagem / 100;
        porcentagem *= preco;
        return preco - porcentagem;
    }

    public void vender(int quantidadeVendida){
        if (verificaDisponibilidade(quantidadeVendida)){
            quantidade -= quantidadeVendida;
            return;
        }
        System.out.println("Estoque insuficiente");
    }

    public void reporEstoque(int repor){
        if (repor > 0){
        quantidade += repor;
        return;
        }
        System.out.println("Não foi possivel fazer a reposição");
    }

}
