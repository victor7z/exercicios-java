package poo;

public class Aluno01 {
    public String nome;
    public double[] notas;

    public void exibirDados(){
        System.out.println("========================");
    System.out.println("Nome: "+ nome);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota: "+ notas[i]);
        }
    }

    public double calcularMedia() {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        return media/ notas.length;
    }

    public void verificarSituacao(){
        String situacao = " ";
        double media = calcularMedia();
        if (media >= 7){
            situacao = "Aprovado";

        }
        else if (media >=5){
            situacao = "Recuperação";
        }
        else {
            situacao = "Reprovado";

        }
        System.out.println(situacao);
    }
}

