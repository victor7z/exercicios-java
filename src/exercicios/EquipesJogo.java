package exercicios;

public class EquipesJogo {
    static void main(String[] args) {
        String [][] equipes = new String[3][];
        equipes [0] = new String[2];
        equipes [1] = new String[3];
        equipes [2] = new String[1];

        equipes[0][0]="Goku";
        equipes[0][1]="Vegeta";

        equipes[1][0]="Naruto";
        equipes[1][1]="Sasuke";
        equipes[1][2]="Sakura";

        equipes[2][0]="Ichigo";

        for (int i = 0; i < equipes.length; i++) {
            System.out.println("Equipes: "+ (i+1));
            for (int j = 0; j < equipes[i].length; j++) {
                System.out.println("Jogador: "+ (j+1)+": "+ equipes[i][j]);
            }

        }
    }
}
