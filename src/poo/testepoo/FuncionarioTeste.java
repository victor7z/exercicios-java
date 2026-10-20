package poo.testepoo;

import poo.Funcionario;

public class FuncionarioTeste {
    static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Carlos";
        funcionario1.cargo = "Almoxarife";
        funcionario1.salario = 2500;
        funcionario1.idade = 25;

        System.out.println("========= FUNCIONARIO 1 ===========");
        funcionario1.exibirDados();
        funcionario1.aumentarSalario();
        System.out.println("======== APÓS AUMENTO =======");
        funcionario1.exibirDados();
        funcionario1.exibirSalarioAnual();
    }
}
