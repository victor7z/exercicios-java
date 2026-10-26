package poo.testepoo;

import poo.Aluno01;

public class Aluno01Teste {
    static void main(String[] args) {
        Aluno01 aluno1 = new Aluno01();
        Aluno01 aluno2 = new Aluno01();
        Aluno01 aluno3 = new Aluno01();

        aluno1.nome = "Victor";
        aluno1.notas= new double[]{8,7,9};


        aluno2.nome = "Ana";
        aluno2.notas= new double[]{5,6,7};


        aluno3.nome = "Carlos";
        aluno3.notas= new double[]{3,4,5};


        aluno1.exibirDados();
        System.out.println("Media: "+ aluno1.calcularMedia());
        aluno1.verificarSituacao();

        aluno2.exibirDados();
        System.out.println("Media: "+ aluno2.calcularMedia());
        aluno2.verificarSituacao();

        aluno3.exibirDados();
        System.out.println("Media: "+ aluno3.calcularMedia());
        aluno3.verificarSituacao();
    }
}
