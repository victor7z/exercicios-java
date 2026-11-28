package revisaoGeral01.dominio;

// A funcionalidade desse programa é mostrar uma ficha cadastral de uma pessoa
/*
   A classe pessoa vai ter os atributos:
   nome, idade, salario, salario sem centavos, inicial do nome, esta ou nao empregada, e a quantidade de filhos.
*/

public class FichaCadastro {
    static void main(String[] args) {
        String nome = "Ana";
        int idade = 25;
        double salario = 2500.75;
        int salarioInteiro = (int)salario;
        char inicial = 'A';
        boolean statusEmprego = true;
        int filhos = 2;

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Salario: "+ salario);
        System.out.println("Salario Sem centavos : "+ salarioInteiro);
        System.out.println("Inicial do nome: "+ inicial);
        System.out.println("Empregada: "+ statusEmprego);
        System.out.println("Filhos: "+ filhos);
    }
}
