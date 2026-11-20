package pooD.teste;

import pooD.dominio.DiaUtil;

public class DiaTeste {
    static void main(String[] args) {
        for (DiaUtil dia : DiaUtil.values()){
            System.out.println("Dia: "+ dia+ " - "+ dia.getNome());
        }

        System.out.println("======DESAFIO======");
        DiaUtil[] dia = DiaUtil.values();

        for (int i = 0; i <dia.length; i++) {
            System.out.println(dia[i]+" - "+ dia[i].getNome());
        }
    }
}
