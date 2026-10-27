package poo;

import jdk.swing.interop.SwingInterOpUtils;

public class SistemaDescontos {
    public String nomeCliente;
    public double valorDaCompra;
    double desconto=0;
    double totalComDesconto = 0;


    public void calcularDesconto(){
        if(valorDaCompra >= 500){
            desconto = valorDaCompra * 0.15;
        }
        else if (valorDaCompra >= 200 && valorDaCompra < 500){
            desconto = valorDaCompra * 0.10;
        }
        totalComDesconto = valorDaCompra - desconto;
    }

    public void notaFiscal(){
        System.out.println("======================");
        System.out.println("NOME DO CLIENTE: "+ nomeCliente);
        System.out.println("VALOR DA COMPRA: "+ valorDaCompra);
        calcularDesconto();
        System.out.println("DESCONTO: "+ desconto);
        System.out.println("TOTAL DA COMPRA COM DESCONTO: "+ totalComDesconto);
    }
}
