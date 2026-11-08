package pooB.dominio;

public class Predio {
    private String[][] salas;

    public void setSalas(String[][] salas){
        this.salas = salas;
    }

    public String[][] getSalas(){
        return this.salas;
    }

    public void exibirSalas(){
        int contador = 1;
        for (String[] salas : this.salas){
            System.out.println("Andar: "+ (contador++));
            for (String sala : salas){
                System.out.println("Sala: "+ sala);
            }
        }
    }

}
