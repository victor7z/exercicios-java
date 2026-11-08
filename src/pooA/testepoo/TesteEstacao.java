package pooA.testepoo;

import pooA.EstacaoMeteorologica;

public class TesteEstacao {
    static void main(String[] args) {
        EstacaoMeteorologica cidade1 = new EstacaoMeteorologica();

        cidade1.definirCidade("São Paulo");


        cidade1.exibirRelatorio(20,25,30);
        cidade1.exibirRelatorio();
    }
}
