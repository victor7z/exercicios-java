package pooD.teste;

import pooD.dominio.StatusPedido;

import java.util.Scanner;

public class StatusTeste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um  código: ");
        int codigo = input.nextInt();
        StatusPedido status = StatusPedido.buscarPorCodigo(codigo);

        if (status == null){
            System.out.println("Codigo invalido");
        }
        else {
            System.out.println(status.getDescricao());
        }



    }
}
