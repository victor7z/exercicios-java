package exercicios;

public class EstoquePrateleiras {
    static void main(String[] args) {
        int [][] estoque = new int[2][2];

        estoque[0][0] = 5;
        estoque[0][1] = 8;

        estoque[1][0]=3;
        estoque[1][1]=10;

        for (int i = 0; i < estoque.length ; i++) {
            System.out.println("Estoque da loja: "+ (i+1));
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.println("Produtos: "+ estoque[i][j]);

            }
        }
    }
}
