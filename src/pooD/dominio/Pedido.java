package pooD.dominio;

public class Pedido {
    private String descricao;
    private double valor;
    private FormaDePagamento formaDePagamento;

    public Pedido(String descricao, double valor, FormaDePagamento formaDePagamento){
        this.descricao = descricao;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void exibirDados(){
        System.out.println(this.descricao);
        System.out.println(this.valor);
        System.out.println(formaDePagamento.getNome());
        System.out.println(valor);
        System.out.println(formaDePagamento.calcularValorFinal(valor));


    }
}
