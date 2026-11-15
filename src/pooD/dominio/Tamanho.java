package pooD.dominio;

public enum Tamanho {
    PEQUENO(6), MEDIO(8), GRANDE(12);
    private int fatias;

    Tamanho(int fatias){
        this.fatias = fatias;
    }

    public int getFatias(){
        return this.fatias;
    }
}
