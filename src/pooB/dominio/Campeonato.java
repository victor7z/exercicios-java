package pooB.dominio;

public class Campeonato {
    private int[][] pontos;

    public void setPontos(int[][] pontos){
        this.pontos = pontos;
    }

    public int[][] getPontos(){
        return this.pontos;
    }

    public void exibirPontos(){
        for (int i = 0; i < this.pontos.length; i++) {
            System.out.println("Rodada: "+(i+1));
            for (int j = 0; j < this.pontos[i].length; j++) {
                System.out.println("Participantes "+(j+1)+": "+ this.pontos[i][j]+" Pontos");
            }
        }
    }
}
