package exercicios;

public class EstoqueSetores {
    static void main(String[] args) {
        int [][] setor = new int[3][];
        setor[0] = new int [3];
        setor[1] = new int [2];
        setor[2] = new int [4];

        setor[0][0] = 5;
        setor[0][1] = 0;
        setor[0][2] = 8;

        setor[1][0] = 0;
        setor[1][1] = 12;

        setor[2][0] = 3;
        setor[2][1] = 0;
        setor[2][2] = 0;
        setor[2][3] = 7;

        int contador = 0;



        for (int [] produtos : setor){
            System.out.println("______________");
            System.out.println("Setor "+ (1+contador++)+"\n");

            int total = 0;
            int numProduto = 0;
            int semEstoque = 0;

            for (int produto  : produtos){
                numProduto ++;
                System.out.println("Produto "+numProduto+ ": "+ produto);
                total += produto;
                if (produto == 0){
                    semEstoque ++;
                }
            }
            System.out.println("\nTotal: "+ total);
            System.out.println("Produtos Sem estoque: "+ semEstoque);
        }



    }
}
