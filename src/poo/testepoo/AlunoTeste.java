package poo.testepoo;

import poo.Aluno;

public class AlunoTeste {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Victor";
        aluno1.idade = 19;
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 7.5;
        aluno1.nota3 = 9.0;


        aluno2.nome = "Lucas";
        aluno2.idade = 20;
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 6.0;
        aluno2.nota3 = 4.0;

        System.out.println("======= ALUNO 1 ==========");
        aluno1.exibirSituacao();
        System.out.println("Nota necessaria: "+ aluno1.calcularNotaNecessaria(7));

        System.out.println("======= ALUNO 2 ==========");
        aluno2.exibirSituacao();
        System.out.println("Nota necessaria: "+ aluno2.calcularNotaNecessaria(7));

    }
}
