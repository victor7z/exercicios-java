package poo;

public class AlunosAcademia {
    public String nome;
    public int numeroMatricula;
    public int idade;
    public double valorFixoMensalidade = 200;
    public double mensalidade = valorFixoMensalidade;
    public double desconto;
    public double taxaDesconto;
    public double faturamento;
    public String tipoPlano = "Não possui plano!";
    public boolean descontoDisponivel = true;

    public void aplicarDesconto(String plano){
        if (!descontoDisponivel){
            System.out.println("Desconto já aplicado");
            return;
        }


        if (plano.equalsIgnoreCase("Ouro")){
            taxaDesconto = 0.10;
            desconto= mensalidade * taxaDesconto;
            mensalidade -= desconto;
            tipoPlano = "Ouro";
            descontoDisponivel = false;
            return;
        }
        else if (plano.equalsIgnoreCase("Diamante")){
            taxaDesconto = 0.20;
            desconto= mensalidade * taxaDesconto;
            mensalidade -= desconto;
            tipoPlano = "Diamante";
            descontoDisponivel = false;
            return;
        }
        System.out.println("Plano indisponivel, Não foi possivel  aplicar o Desconto!");


    }

    public boolean consultarDebitosEmAberto(){
        if (mensalidade > 0){
            System.out.println("você possui debito em aberto de R$ : "+mensalidade);
            return true;
        }
        System.out.println("Você não possui debito em aberto");
        return false;
    }

    public void pagarMensalidade(double valorPagamento){
        if (valorPagamento > 0 && valorPagamento <= mensalidade){
            mensalidade -=valorPagamento;
            System.out.println("Pagamento Realizado com sucesso!");
            faturamento +=valorPagamento;
            return;
        }
        System.out.println("Pagamento Recusado! Confira o valor e tente novamente!");
    }

    public void cadastroDoAluno(){
        System.out.println("=================");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Numero de Matricula: "+ numeroMatricula);
        System.out.println("Valor Fixo Mensalidade: "+ valorFixoMensalidade);
        System.out.println("Tipo de Plano: "+ tipoPlano );
        System.out.println("Desconto: "+ desconto);
        if (mensalidade <= 0){
            System.out.println("Você não possui mensalidade a pagar no momento!");
            return;
        }
        System.out.println("Valor total da mesalidade com desconto: "+mensalidade);
    }

}
