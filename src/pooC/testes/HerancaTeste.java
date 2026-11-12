package pooC.testes;

import pooC.dominio.Funcionario;
import pooC.dominio.Pessoa;

public class HerancaTeste {
    static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("joão");
        Funcionario funcionario1 = new Funcionario("jorge",2999);

        pessoa1.imprime();
        System.out.println("===========");
        funcionario1.imprime();
    }

}
