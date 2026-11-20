package pooF.teste;

import pooF.dominio.Cachorro;
import pooF.dominio.Gato;

public class AnimalTeste {
    static void main(String[] args) {
        Cachorro cachorro = new Cachorro("rex");
        Gato gato = new Gato("Mia");


        System.out.println("==============");
        cachorro.apresentar();
        System.out.println("==============");
        gato.apresentar();

    }
}
