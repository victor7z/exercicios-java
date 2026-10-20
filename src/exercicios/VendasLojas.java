package exercicios;

public class VendasLojas {
    static void main(String[] args) {
        double [][] loja = new double[2][3];

        loja [0][0]= 150.0;
        loja [0][1]= 200.0;
        loja [0][2]= 100.0;

        loja [1][0]= 300.0;
        loja [1][1]= 250.0;
        loja [1][2]= 200.0;

        for (int i = 0; i < loja.length; i++) {
            System.out.println("Loja: "+ (i+1));
            double total = 0;
            for (int j = 0; j < loja[i].length; j++) {
                System.out.println("Dia "+(j+1)+": "+loja[i][j]);
                total += loja[i][j];
            }

            System.out.println("Total: "+ total);
            if (total >=600){
                System.out.println("Meta atingida");
            }
            else {
                System.out.println("Meta não atingida");

            }

        }
    }
}
