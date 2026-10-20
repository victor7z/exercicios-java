package exercicios;

public class ContagemEstoque {
    static void main(String[] args) {
        int quntidadeProdutos = 5;
        int contador = 1;

        while(quntidadeProdutos >= contador){
        System.out.println("Produto "+ contador + " Conferido");
        contador ++;
        }

        System.out.println("Conferência Finalizada!");

    }
}
