package poo2.testes;

import poo2.dominio.Personagem;

public class PersonagemTeste {
    static void main(String[] args) {
        Personagem personagem1 = new Personagem("Victor");
        Personagem personagem2 = new Personagem("Luna",50);
        Personagem personagem3 = new Personagem("Thor",-10);

        personagem1.exibirDados();
        personagem2.exibirDados();
        personagem3.exibirDados();

    }
}
