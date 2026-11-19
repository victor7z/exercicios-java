package pooD.dominio;

public enum StatusPedido {
    AGUARDANDO(1, "Aguardando Pagamento"),
    ENVIADO(2, "Pedido Enviado"),
    ENTREGUE(3, "Pedido Entregue");
    private int codigo;
    private String descricao;

    StatusPedido(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static StatusPedido buscarPorCodigo(int codigo){
        for (StatusPedido statusPedido : values()){
            if(statusPedido.getCodigo() == codigo){
                return statusPedido;
            }
        }
        return null;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
