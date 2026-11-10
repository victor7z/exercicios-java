package pooC.testes;

import pooC.dominio.Aluno;
import pooC.dominio.Local;
import pooC.dominio.Professor;
import pooC.dominio.Seminario;

public class SistemaSeminarioTeste {
    static void main(String[] args) {
        Local local1 = new Local("rua de exemplo 123");
        Professor professor1 = new Professor("Alberto", "Filosofia");
        Aluno aluno1 = new Aluno("Victor", 19);
        Aluno[] alunosSeminario = new Aluno[]{aluno1};

        Seminario seminario1 = new Seminario("A historia do Java", local1,alunosSeminario);

        Seminario[] seminariosDiponiveis = new Seminario[]{seminario1};
        professor1.setSeminarios(seminariosDiponiveis);


        professor1.imprime();
    }
}
