package pooC.testes;

import java.util.Scanner;

public class LeituraTeste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        int idade = input.nextInt();

        System.out.print("Digite sua idade: ");
        String nome = input.nextLine();

        System.out.println("Olá, "+nome+"! " +
                "Você tem "+idade+" anos.");
    }
}
