package exercicios;

public class MetaEconomia {
    static void main(String[] args) {
        double meta = 500;
        double saldo = 0;
        double depositoSemanal = 80;
        int semana = 0;

        do {
            semana ++;
            saldo += depositoSemanal;
            System.out.println("Semana: "+ semana);
            System.out.println("Saldo: R$"+ saldo);
            System.out.println("=================");
        }while (saldo < meta);
        System.out.println("Semanas Necessarias Para Alcançar a Meta: "+ semana + " Semanas");
        double valorUtrapassado = saldo - meta;
        System.out.println("Quanto Utrapassou a meta: R$"+ valorUtrapassado);
        System.out.println("Deposito Semanal Foi De: R$"+ depositoSemanal);
        System.out.println("Saldo Final: R$"+ saldo);
    }
}
