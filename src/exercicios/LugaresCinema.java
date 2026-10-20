package exercicios;

public class LugaresCinema {
    static void main(String[] args) {
        String [][] lugares = new String[2][3];

        lugares[0][0] = "Ana";
        lugares[0][1] = "Bruno";
        lugares[0][2] = "Carlos";
        lugares[1][0] = "Duda";
        lugares[1][1] = "Eva";
        lugares[1][2] = "Felipe";

        for (int i = 0; i < lugares.length; i++) {
            System.out.println("Fileira: "+ (i+1));
            for (int j = 0; j < lugares[i].length; j++) {
                System.out.println("Assento "+ (j+1)+": "+ lugares[i][j] );
            }
        }
    }

}
