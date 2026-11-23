package pooF.teste;

import pooF.dominio.Calculadora;
import pooF.dominio.Imposto;

public class CalculadoraTeste {
    static void main(String[] args) {
        Calculadora.mostrarTaxa();
        System.out.println(Calculadora.TAXA);
        Imposto imposto = new Imposto();
        System.out.println(imposto.calcularValor(200));
    }
}
