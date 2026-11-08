package pooB.testes;

import pooB.dominio.Aluno;
import pooB.dominio.Sala;

public class TesteAluno {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("José");
        Sala sala = new Sala(1);
        
        aluno1.setSala(sala);

        aluno1.imprimir();
    }
}
