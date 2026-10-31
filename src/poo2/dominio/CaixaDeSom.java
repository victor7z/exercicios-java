package poo2.dominio;

public class CaixaDeSom {
    public String status = "Caixa Desligada";
    private int volume;

    public void exibirCaixaDeSom(){
        System.out.println("Status: "+status);
        if (status == "Caixa Ligada") {
        System.out.println("Volume: "+volume);
        }
    }

    public void ligar(){
        this.status = "Caixa Ligada";
    }
    public void desligar(){
        this.status = "Caixa Desligada";
    }

    public void setVolume(int volume){
        if (status == "Caixa Ligada") {
            if (volume >=0 && volume <=100 ) {
                this.volume = volume;
                return;
            }
            System.out.println("O volume tem um limite de 0 a 100! Tente novamente");
        }

    }

    public int getVolume(){
        return this.volume;
    }

}
