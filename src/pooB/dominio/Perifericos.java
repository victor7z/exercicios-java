package pooB.dominio;

public class Perifericos {
    private String nome;
    private int desconto;

    public void imprime(){
        System.out.println("Produto: "+this.nome);
        System.out.println("Desconto: "+this.desconto+"%");
    }

    public Perifericos(String nome){
        this.nome = nome;
        this.desconto = 10;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco (int preco){
        this.desconto = preco;
    }

    public int preco (){
        return this.desconto;
    }
}
