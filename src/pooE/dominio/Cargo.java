package pooE.dominio;

public enum Cargo {
    ESTAGIARIO(1500), ANALISTA(4000), GERENTE(8000);

    private double salarioBase;
    Cargo(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }
}
