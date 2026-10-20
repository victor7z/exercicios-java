package exercicios;

public class PularNumero {
    static void main(String[] args) {
        int numeroIgnorado = 4;

        for (int i = 1; i <=10 ; i++) {
            if (i == numeroIgnorado) {
                continue;
            }
            System.out.println(i);
        }

    }

}
