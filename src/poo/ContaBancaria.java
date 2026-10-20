package poo;

public class ContaBancaria {
    public String titular;
    public int numeroConta;
    public double saldo;

    public void exibirDados(){
        System.out.println("Titular "+ titular);
        System.out.println("Numero da Conta: "+ numeroConta);
        System.out.println("Saldo: "+saldo);
    }
    public void depositar(double valor){
    if (valor >0){
        saldo += valor;
    }

    }
    public void sacar(double valor){
        if (valor <= saldo && valor >0){
            saldo -= valor;
        }
        else {
            System.out.println("Saque recusado");
        }
    }
    public void aumentarSalario(double porcentagem){
        if (porcentagem > 0){
            double aumento = 0;
            aumento = saldo * porcentagem;
            saldo +=aumento;

        }
    }
}
