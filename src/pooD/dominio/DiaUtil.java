package pooD.dominio;

public enum DiaUtil {
    SEGUNDA("Segunda-feira"), TERCA("Terça-feira"), QUARTA("Quarta-feira");
    private String nome;

    DiaUtil(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
