package exercicios;

public class NotasAlunos {
    static void main(String[] args) {
        double [] notas = new double[4];
        double soma = 0;
        double media = 0;

        notas [0] = 7.5;
        notas [1] = 8.0;
        notas [2] = 6.5;
        notas [3] = 9.0;

        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Notas"+ (i+1)+  ": "+ notas[i]);
            soma += notas[i];
        }
        System.out.println("Soma:" + soma);
        media = soma/ notas.length;
        System.out.println("Media: "+ media);

    }
}
