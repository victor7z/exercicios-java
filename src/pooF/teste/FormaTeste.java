package pooF.teste;

import pooF.dominio.Circulo;
import pooF.dominio.Quadrado;
import pooF.dominio.Retangulo;

public class FormaTeste {
    static void main(String[] args) {
        Quadrado quadrado = new Quadrado("quadrado", 4);
        Retangulo retangulo = new Retangulo("retangulo", 3, 5);
        Circulo circulo = new Circulo(2);

        quadrado.exibirArea();
        retangulo.exibirArea();
        circulo.exibirArea();
    }
}
