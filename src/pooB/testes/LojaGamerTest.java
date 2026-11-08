package pooB.testes;

import pooB.dominio.LojaGamer;

public class LojaGamerTest {
    static void main(String[] args) {
        String[] categoria = {"Perifericos","Hardwares"};
        String[][] produtos = {
                {"Mouse", "Teclado", "Monitor"},
                {"Placa mãe", "Prrocessador", "Placa de Video"}
        };
        double[][] precos = {
                {600, 300, 800},
                {500,700,2500}
        };
        int[][] estoque = {
                {10,8,5},
                {6,4,3}
        };

        LojaGamer loja01 = new LojaGamer(categoria, produtos,precos,estoque);
        loja01.exibirLoja();
        loja01.comprar("mouse", 7);

    }
}
