package poo.testepoo;


import poo.Personagens;

public class TestePersonagens {
    static void main(String[] args) {
        ImprimirPersonagens impressora = new ImprimirPersonagens();
        Personagens personagem1 = new Personagens();
        Personagens personagem2 = new Personagens();
        Personagens personagem3 = new Personagens();
        Personagens personagem4 = new Personagens();

        personagem1.nome = "Iso";
        personagem1.idade = 21;
        personagem1.nivel = 10;

        personagem2.nome = "saje";
        personagem2.idade = 25;
        personagem2.nivel = 15;

        personagem3.nome = "fenix";
        personagem3.idade = 27;
        personagem3.nivel = 55;

        personagem4.nome = "brimstom";
        personagem4.idade = 19;
        personagem4.nivel = 30;

        impressora.imprimir(personagem1);
        impressora.imprimir(personagem2);
        impressora.imprimir(personagem3);
        impressora.imprimir(personagem4);
    }

}
