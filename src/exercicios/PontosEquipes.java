package exercicios;

public class PontosEquipes {
    public static void main(String[] args) {
        int [][] pontos = new int[3][];
        pontos[0] = new int[3];
        pontos[1] = new int[2];
        pontos[2] = new int[4];

        pontos[0][0] = 10;
        pontos[0][1] = 20;
        pontos[0][2] = 15;

        pontos[1][0] = 8;
        pontos[1][1] = 12;

        pontos[2][0] = 25;
        pontos[2][1] = 5;
        pontos[2][2] = 10;
        pontos[2][3] = 20;

        for (int i = 0; i < pontos.length ; i++) {
            System.out.println("--------------");
            System.out.println("Equipe: "+ (i+1));
            System.out.println(" ");
            int total = 0;
            for (int j = 0; j <pontos[i].length ; j++) {
                System.out.println("Pontos: "+ pontos[i][j]);
                total += pontos[i][j];
            }
            System.out.println("Total De Pontos: "+ total);
        }

    }
}
