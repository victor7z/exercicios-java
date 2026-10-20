package poo.testepoo;

import poo.Personagens;

public class ImprimirPersonagens {
        public void imprimir(Personagens personagens){
            System.out.println("=====================");
            System.out.println(personagens.nome);
            System.out.println(personagens.idade);
            System.out.println(personagens.nivel);
        }

}
