package pooE.dominio;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, Cargo cargo, double bonus) {
        super(nome, Cargo.GERENTE);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bonus: "+ bonus);
    }
}
