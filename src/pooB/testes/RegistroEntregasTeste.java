package pooB.testes;

import pooB.dominio.RegistroEntregas;

public class RegistroEntregasTeste {
    static void main(String[] args) {
        RegistroEntregas registro01 = new RegistroEntregas();
        int[] tempos = {15,30,20,45};

        registro01.setTempos(tempos);
        registro01.exibirTempos();
        System.out.println("Total de Entregas: "+registro01.getTempos().length);
    }
}
