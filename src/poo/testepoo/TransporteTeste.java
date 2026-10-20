package poo.testepoo;

import poo.Aviao;
import poo.Moto;
import poo.Navio;

public class TransporteTeste {
    static void main(String[] args) {
        Navio navio = new Navio();
        Moto moto = new Moto();
        Aviao aviao = new Aviao();

        moto.modelo = "MT-07";
        moto.marca = "Yamaha";
        moto.ano = 2019;
        moto.quantidadeRodas = 2;

        aviao.modelo = "Anfibio";
        aviao.altitudeMax = 2000;
        aviao.capacidadePassageiros = 2;
        aviao.companhiaAerea = "Gol";

        navio.nome = "Titanic";
        navio.capacidadeCarga = 100000;
        navio.quantidadeTripulantes = 500;
        navio.tipo = "nao sei kkkk";

    }


}
