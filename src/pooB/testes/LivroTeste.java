package pooB.testes;

import pooB.dominio.Biblioteca;
import pooB.dominio.Livro;

public class LivroTeste {
    static void main(String[] args) {
        Livro livro1 = new Livro("Use a Cabeça Java");
        Livro livro2 = new Livro("O Homem Mais Rico Da Babilônia");
        Livro[] livros = new Livro[]{livro1,livro2};
        Biblioteca biblioteca1 = new Biblioteca("Setor Principal");
        livro1.setBiblioteca(biblioteca1);
        livro2.setBiblioteca(biblioteca1);

        for (Livro livro : livros){
            livro.imprime();
        }
    }
}
