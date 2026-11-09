package pooC.dominio;

public class Jogador {
    private String nome;
    private int numeroCamisa;
    private Time time;

    public Jogador(String nome, int numeroCamisa){
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public void exibirDados(){
        System.out.println(this.nome);
        System.out.println(this.numeroCamisa);
        if (time == null){
            System.out.println("Sem time");
            return;
        }
        System.out.println(time.getNome());

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setNumeroCamisa(int numeroCamisa){
        this.numeroCamisa = numeroCamisa;
    }
    public int getNumeroCamisa(){
        return this.numeroCamisa;
    }

    public void setTime(Time time){
        this.time = time;
    }
    public Time getTime(){
        return this.time;
    }
}
