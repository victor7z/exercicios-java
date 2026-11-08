package poo2.testes;

import poo2.dominio.Escola;
import poo2.dominio.Professor;

public class EscolaTeste {
    static void main(String[] args) {
        Escola escola1 = new Escola("Jardim Das Palmeiras");
        Escola escola2 = new Escola("Jardim 2");

        Professor professor1 = new Professor("Henrique");
        Professor professor2 = new Professor("Alberto");
        Professor professor3 = new Professor("Vera");

        Professor professorA = new Professor("Davi");
        Professor professorB = new Professor("Mauricio");
        Professor professorC = new Professor("Adilson");

        Professor[] professoresG1 = new Professor[]{professor1,professor2,professor3};
        Professor[] professoresG2 = new Professor[]{professorA,professorB,professorC};


        escola1.setProfessor(professoresG1);
        escola1.imprime();

        escola2.setProfessor(professoresG2);
        escola2.imprime();
    }
}
