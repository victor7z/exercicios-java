package poo2.dominio;

public class LojaGamer {
    private String[] categoria;
    private String[][] produtos;
    private double[][] precos;
    private int[][] estoque;

    public LojaGamer(String[] categoria, String[][] produtos, double[][] precos, int[][] estoque){
        this.categoria = categoria;
        this.produtos = produtos;
        this.precos = precos;
        this.estoque= estoque;
    }

    public void comprar(String nome, int quantidade){
        if (quantidade <= 0){
            System.out.println("Quantidade Invalida!");
            return;
        }
        for (int i = 0; i < produtos.length; i++) {
            for (int j = 0; j <this.produtos[i].length ; j++) {
                if (nome.equalsIgnoreCase(produtos[i][j])){
                    if (estoque[i][j] < quantidade){
                        System.out.println("Estoque Insuficiente!");
                        return;
                    }
                    estoque[i][j] -= quantidade;
                    System.out.println("Compra Realizada com sucesso!");
                    System.out.println("Estoque Restante "+produtos[i][j] +": "+ estoque[i][j]);
                }
            }
        }
    }

    public void exibirLoja(){
        for (int i = 0; i <this.categoria.length ; i++) {
            double total= 0;
            System.out.println("\nCategoria: "+ this.categoria[i]);
            for (int j = 0; j <this.produtos[i].length; j++) {
                System.out.println("Produtos: "+this.produtos[i][j] + "\n Preços: "+ this.precos[i][j]+ "\n Estoque: "+ this.estoque[i][j]);
                total += this.precos[i][j];
            }
            System.out.println("Total: "+ total);
        }

    }

}
