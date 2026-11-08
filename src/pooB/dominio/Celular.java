package pooB.dominio;

public class Celular {
    private String modelo;
    private LojaCelular filial;

    public void imprimir(){
        System.out.println(this.modelo);
        if (filial != null){
            System.out.println(filial.getNome());
            return;
        }
        System.out.println("Não possui filial");
    }

    public Celular(String modelo){
        this.modelo = modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setFilial(LojaCelular filial){
        this.filial = filial;
    }

    public LojaCelular getFilial(){
        return this.filial;
    }
}
