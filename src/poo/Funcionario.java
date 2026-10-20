package poo;

public class Funcionario {
    public String nome;
    public String cargo;
    public double salario;
    public int idade;

    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario: "+ salario);
        System.out.println("Idade: "+ idade);
    }

    public void aumentarSalario(){
        double aumento = (salario *0.1);
        salario += aumento;
    }

    public void exibirSalarioAnual(){
        System.out.println("Salario anual: "+ (salario *12));
    }
}
