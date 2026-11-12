package pooC.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public Funcionario(String nome, double salario){
        super(nome);
        System.out.println("Construtor de Funcionario");
        this.salario = salario;
    }

}
