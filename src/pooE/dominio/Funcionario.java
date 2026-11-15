package pooE.dominio;

public class Funcionario {
    private String nome;
    private Cargo cargo;

    public Funcionario(String nome, Cargo cargo){
        this.nome = nome;
        this.cargo = cargo;
    }

    public double calcularSalario(){
        return cargo.getSalarioBase();
    }

    public void exibirDados(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("cargo: "+ this.cargo);
        System.out.println("salario: "+ calcularSalario());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
