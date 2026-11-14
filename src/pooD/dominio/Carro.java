package pooD.dominio;

public class Carro extends Veiculo{
    private int portas;



    @Override
    public void descrever() {
        super.descrever();
        System.out.println("portas: "+ portas);
    }

    public Carro(String marca, int portas) {
        super(marca);
        this.portas = portas;
    }
}
