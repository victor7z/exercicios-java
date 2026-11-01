package poo2.dominio;

public class RegistroEntregas {
    private int[] tempos;


    public void setTempos(int[] tempos){
        this.tempos = tempos;
    }

    public int[] getTempos(){
        return this.tempos;
    }

    public void exibirTempos(){
        for (int i = 0; i < tempos.length; i++) {
            System.out.println("Entrega " + (i+1)+": "+ tempos[i] + " Minutos");
        }
    }
}
