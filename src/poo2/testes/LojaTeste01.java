package poo2.testes;

import poo2.dominio.Loja;

public class LojaTeste01 {
    static void main(String[] args) {
        Loja loja01 = new Loja("Redragon",10 );
        Loja loja02 = new Loja("Logitec",5 );
        Loja loja03 = new Loja("Razer",16 );
        Loja[] lojas = new Loja[]{loja01,loja02,loja03};

        for (Loja loja : lojas){
            loja.exibirDados();
        }
    }
}
