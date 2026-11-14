package pooD.dominio;

public class Veiculo {
    protected String marca;
    public static final int RODAS_PADRAO = 4;


    public void descrever(){
        System.out.println("Veiculo da marca: "+ this.marca);
    }

    public Veiculo(String marca){
        this.marca = marca;
    }

}
