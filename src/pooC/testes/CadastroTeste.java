package pooC.testes;

import java.util.Scanner;

public class CadastroTeste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite Seu Nome:");
        String nome = input.nextLine();

        System.out.println("Digite Sua Idade:");
        int idade = input.nextInt();

        System.out.println("Olá "+ nome+ "! Você tem "+ idade+"anos");
        


    }
}
