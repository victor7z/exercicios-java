package pooE.teste;

import pooE.dominio.Cargo;
import pooE.dominio.Funcionario;
import pooE.dominio.Gerente;

import java.util.Scanner;

public class FuncionarioTeste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite Seu nome: ");
        String nome = input.nextLine();

        Funcionario funcionario1 = new Funcionario(nome, Cargo.ESTAGIARIO);

        funcionario1.exibirDados();

        Gerente gerente1 = new Gerente("JC",Cargo.GERENTE,100);
        gerente1.exibirDados();
    }
}
