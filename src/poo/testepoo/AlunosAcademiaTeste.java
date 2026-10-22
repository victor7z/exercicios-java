package poo.testepoo;

import poo.AlunosAcademia;

public class AlunosAcademiaTeste {
    static void main(String[] args) {
        AlunosAcademia aluno1 = new AlunosAcademia();
        AlunosAcademia aluno2 = new AlunosAcademia();

        /*Tipos de plano:
        * ouro: 10%
        * diamante: 20%
        * */

        aluno1.nome = "Jorge";
        aluno1.numeroMatricula = 01;
        aluno1.idade = 34;
        aluno1.mensalidade = 200;
        aluno1.aplicarDesconto("Diamante");

        aluno2.nome = "Luis Felipe Alves Santos ";
        aluno2.numeroMatricula = 02;
        aluno2.idade = 20;
        aluno2.mensalidade = 300;



        aluno1.cadastroDoAluno();
        aluno1.consultarDebitosEmAberto();
        aluno1.pagarMensalidade(160);


        aluno1.cadastroDoAluno();

        aluno2.cadastroDoAluno();
        aluno2.aplicarDesconto("Diamante");
        aluno2.cadastroDoAluno();




    }
}
