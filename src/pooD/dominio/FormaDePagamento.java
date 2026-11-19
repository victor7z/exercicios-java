package pooD.dominio;

public enum FormaDePagamento {
    DINHEIRO("Dinheiro"),
    CARTAO("Cartão"){
        @Override
        public double calcularValorFinal(double valor) {
            return valor * 1.05;
        }},
    PIX("pix"){
        @Override
        public double calcularValorFinal(double valor) {
            return valor * 0.90;
        }};

    public double calcularValorFinal(double valor){
        return valor;
    }

    private String nome;

    FormaDePagamento(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
