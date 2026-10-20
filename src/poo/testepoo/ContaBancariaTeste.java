package poo.testepoo;

import poo.ContaBancaria;

public class ContaBancariaTeste {
    static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();

        contaBancaria1.titular = "Victor";
        contaBancaria1.numeroConta = 1001;
        contaBancaria1.saldo = 1500;

        contaBancaria1.exibirDados();
        contaBancaria1.depositar(500);
        contaBancaria1.sacar(200);
        contaBancaria1.aumentarSalario(0.10);
        contaBancaria1.sacar(3000);
        System.out.println("===============");
        contaBancaria1.exibirDados();
    }
}
