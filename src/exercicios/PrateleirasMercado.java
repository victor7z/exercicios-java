package exercicios;

public class PrateleirasMercado {
    public static void main(String[] args) {
        String[][] produtos = new String[2][];
        produtos [0] = new String[3];
        produtos [1] = new String[2];

        produtos [0][0] = "Arroz";
        produtos [0][1] = "Feijão";
        produtos [0][2] = "Macarrão";

        produtos [1][0] = "Leite";
        produtos [1][1] = "Café";

        for (int i = 0; i < produtos.length ; i++) {
            System.out.println("Prateleira: "+ (i+1));
            for (int j = 0; j <produtos[i].length ; j++) {
                System.out.println("Produto "+ (j+1)+ ": "+produtos[i][j]);

            }

        }
    }
}
