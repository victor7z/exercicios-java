package revisaoGeral01.dominio;

public class Boletim {
    static void main(String[] args) {
        double nota1 = 7;
        double nota2 = 8;
        double nota3 = 6;
        int faltas = 8;
        double media = (nota1 + nota2 + nota3) /3;
        faltas ++;

        boolean aprovado = media >= 7 && faltas <= 10;
        boolean provaExtra = media <5 || faltas > 10;


        System.out.println("Média: "+ media);
        media += 0.5;
        System.out.println("Média com bônus: "+ media);
        System.out.println("Faltas: "+ faltas);
        System.out.println("Aprovado: "+ aprovado);
        System.out.println("Precisa de prova extra: "+ provaExtra);
        int resto = 45 % 2;
        System.out.println("Resto de 45 por 2: "+ resto);

    }
}
