package poo2.dominio;

public class Loja {
    private String nome;
    private int quantidadeProdutos;
    private static String nomeDaRede;
    private static double descontoPadrao;

    static{
        Loja.nomeDaRede = "TechStore";
        Loja.descontoPadrao = 10;
        System.out.println("Configurações da rede carregadas");
    }

    public Loja(String nome, int quantidadeProdutos){
        this.nome = nome;
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public void exibirDados(){
        System.out.println("\nNome da Rede: "+ nomeDaRede);
        System.out.println("Nome da Loja: "+ nome);
        System.out.println("Desconto: "+ descontoPadrao+"%");
        System.out.println("Quantidade de produtos: "+ quantidadeProdutos);
    }
}
