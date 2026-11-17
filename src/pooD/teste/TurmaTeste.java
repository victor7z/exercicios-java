package pooD.teste;

import pooD.dominio.Aluno;
import pooD.dominio.Turma;

import java.util.Scanner;

public class TurmaTeste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da primeira turma: ");
        String nomeTurma01 = input.nextLine();
        System.out.print("Digite o nome da segunda turma: ");
        String nomeTurma02 = input.nextLine();
        System.out.print("Digite o nome da terceira turma: ");
        String nomeTurma03 = input.nextLine();


        Turma turmaA = new Turma(nomeTurma01);
        Turma turmaB = new Turma(nomeTurma02);
        Turma turmaC = new Turma(nomeTurma03);

        System.out.println("==============");

        Aluno aluno1 = new Aluno("josé");
        Aluno aluno2 = new Aluno("joão");
        Aluno aluno3 = new Aluno("josivan");

        Aluno aluno4 = new Aluno("Roberto");
        Aluno aluno5 = new Aluno("Romario");
        Aluno aluno6 = new Aluno("Ronaldo");

        Aluno[] alunosTurmaA = new Aluno[]{aluno1,aluno2,aluno3};
        Aluno[] alunosTurmaB = new Aluno[]{aluno4,aluno5,aluno6};

        System.out.print("Digite a quantidade de alunos que deseja na terceira Turma: ");
        int quantidadeTurmaC = input.nextInt();
        input.nextLine();

        Aluno[] alunosTurmaC = new Aluno[quantidadeTurmaC];
        for (int i = 0; i < alunosTurmaC.length; i++) {
            System.out.print("Digite os nome dos Aluno: ");
            String nome = input.nextLine();
            alunosTurmaC[i] = new Aluno(nome);
        }

        turmaA.setAlunos(alunosTurmaA);
        turmaB.setAlunos(alunosTurmaB);
        turmaC.setAlunos(alunosTurmaC);

        turmaA.exibirDados();
        System.out.println("=========");
        turmaB.exibirDados();
        System.out.println("========");
        turmaC.exibirDados();

    }
}
