package poo;

public class Aluno {
    public String nome;
    public int idade;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularMedia(){
        return (nota1 + nota2 + nota3)/3;
    }
    public boolean verificarAprovacoes(){
        if (calcularMedia() >= 7){
            return true;

        }
        return false;
    }
    public double calcularNotaNecessaria(double mediaDesejada){
        mediaDesejada = 4* mediaDesejada;
        return mediaDesejada-(nota1 + nota2 + nota3);

    }
    public void exibirSituacao(){
        System.out.println("Nome: "+ nome);
        System.out.println("Media: "+calcularMedia());
        System.out.println("Aprovacao: "+ verificarAprovacoes());

    }

}
