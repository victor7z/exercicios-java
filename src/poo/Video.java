package poo;

public class Video {

    public String titulo;
    public int duracaoSegundos;

    public void definirTitulo(String titulo){
        this.titulo = titulo;
    }

    public void cortarVideo(int segundos){
        if (segundos > duracaoSegundos){
            System.out.println("Corte Invalido");
            return;
        }
        duracaoSegundos -= segundos;
        System.out.println("Corte Realizado com sucesso");
    }

    public void adicionarTrechos(int... duracoes){
        for (int i = 0; i < duracoes.length; i++) {
            this.duracaoSegundos += duracoes[i];
        }

    }

    public void exibirDados(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Duração total: "+ duracaoSegundos);
    }
}
