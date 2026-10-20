package exercicios;

public class ListaPersonagem {
    static void main(String[] args) {
        String [] personagens = new String[4];
        personagens [0] = "Goku";
        personagens [1] = "madara";
        personagens [2] = "Itachi";
        personagens [3] = "Naruto";
        personagens [1] = "Vegeta";


        for (int i = 0; i < personagens.length ; i++) {
            System.out.println("Personagem "+(i+1)+ ": "+personagens[i]);
        }

    }
}
