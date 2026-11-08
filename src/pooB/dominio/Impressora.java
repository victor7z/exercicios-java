package pooB.dominio;

public class Impressora {
    private String modelo;
    private int folhas;
    private static int limitePorImpressao;

    /*bloco de inicialização estatico*/
    static{
        Impressora.limitePorImpressao = 20;
        System.out.println("\nLimite de impressão configurado!");
    }

    /*bloco de inicialização*/
    {
        this.folhas = 50;
        System.out.println("Papel inicial Carregado!");
    }

    /*Construtor*/
    public Impressora (String modelo){
        this.modelo = modelo;
        System.out.println("Impressora Criada: "+modelo);
    }


    /*Metodo Imprimir*/
    public void imprimir(int quantidade){
        if (quantidade <= 0){
            System.out.println("Defina uma quantidade valida para impressão!");
        }
        else if (quantidade > folhas){
            System.out.println("Folhas insuficientes");
        }
        else if (quantidade > limitePorImpressao){
            System.out.println("Você não pode Imprimir essa quantidade porque ultrapassa o limite");
        }
        else {
            folhas -= quantidade;
            System.out.println("Impressão Concluida com sucesso!");
            System.out.println("Quantidade Restante: "+ folhas);
        }
    }

    /*Metodo get*/
    public int getFolhas() {
        return folhas;
    }
}
