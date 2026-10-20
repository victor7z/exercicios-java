package poo.testepoo;

import poo.Carro;

public class CarroTeste {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2022;
        carro1.preco = 120000.0;
        carro1.cor= "Preto";

        carro2.modelo = "Corolla";
        carro2.marca = "Toyota";
        carro2.ano = 2023;
        carro2.preco = 135000.0;
        carro2.cor= "Branco";


        System.out.println("========= Carro 1 =========");
        System.out.println(carro1.modelo);
        System.out.println(carro1.marca);
        System.out.println(carro1.ano);
        System.out.println(carro1.preco);
        System.out.println(carro1.cor);

        System.out.println("========= Carro 2 =========");
        System.out.println(carro2.modelo);
        System.out.println(carro2.marca);
        System.out.println(carro2.ano);
        System.out.println(carro2.preco);
        System.out.println(carro2.cor);


    }
}
