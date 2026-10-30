package poo;

public class Dispositivo {
    public String nome;
    public int bateria;

    public void definirNome(String nome){
        this.nome = nome;
    }
    public void carregar(int quantidade){
        if (quantidade >0 && quantidade <=100){
            bateria +=quantidade;
            if (bateria>100){
                bateria = 100;
            }
            System.out.println("Carregou: "+bateria+"%");
            return;
        }
        System.out.println("Não foi possivel carregar");

    }

    public int calcularConsumo(int... consumos){
        if (consumos.length == 0){
            return 0;
        }
        int somaConsumos = 0;
        for (int i = 0; i <consumos.length ; i++) {
            somaConsumos += consumos[i];

        }
        return somaConsumos;
    }

    public void usar(int... consumos){
    int usarCelular = calcularConsumo(consumos);
    if (usarCelular > bateria){
        System.out.println("Bateria insuficiente");
        return;
    }
    bateria -= usarCelular;
    }

    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Bateria: "+bateria+"%");

    }


}
