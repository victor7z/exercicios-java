package pooC.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome){
        this.nome = nome;
    }

    public void exibirDados(){
        System.out.println(this.nome);
        if (jogadores == null){
            System.out.println("Nenhum Jogador Cadastrado!");
            return;
        }
        for (Jogador jogador : jogadores){
            System.out.print(jogador.getNome());
            System.out.println(" "+jogador.getNumeroCamisa());
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setJogadores(Jogador[] jogadores){
        this.jogadores = jogadores;
        for (Jogador jogador : jogadores){
            jogador.setTime(this);
        }
    }

    public Jogador[] getJogadores(){
        return this.jogadores;
    }
}
