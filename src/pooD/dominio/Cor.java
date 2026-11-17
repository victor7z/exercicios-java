package pooD.dominio;

public enum Cor {
    PRETO("Preto"), BRANCO("Branco"), AZUL("Azul");

    private String descricao;

    Cor(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
