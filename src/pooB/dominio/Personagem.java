package pooB.dominio;

public class Personagem {
    private String nome;
    private int vida;
    private int energia;
    private String[] habilidades;

    {
        this.vida = 100;
        this.energia = 80;
        this.habilidades = new String[]{"Correr", "Pular", "Defender"};
        System.out.println("Inicializando personagem...");
    }

    public Personagem(String nome){
        this.nome = nome;
    }

    public Personagem(String nome, int energia){
        this.nome = nome;
        if (energia >= 0 && energia <=100){
            this.energia = energia;
        }
    }

    public void exibirDados(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("vida: "+ this.vida);
        System.out.println("Energia: "+ this.energia);
        for (String habilidade : habilidades){
            System.out.println("Habilidades: "+ habilidade);
        }
    }
}
