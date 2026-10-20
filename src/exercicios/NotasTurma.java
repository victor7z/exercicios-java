package exercicios;

public class NotasTurma {
    static void main(String[] args) {
        double [][] notas = new double[2][3];

        notas [0][0] = 7.0;
        notas [0][1] = 8.5;
        notas [0][2] = 6.0;

        notas [1][0] = 9.0;
        notas [1][1] = 5.5;
        notas [1][2] = 8.0;

        for (int i = 0; i <notas.length ; i++) {
            System.out.println("Aluno: "+ (i+1));
            double soma = 0;

            for (int j = 0; j < notas[i].length ; j++) {
                System.out.println("Nota "+ (j+1) + ": " + notas[i][j]);
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.println("media: "+media);
            }

        }
    }

