package exercicios;

public class ComprasForEach {
    static void main(String[] args) {
        double [] precos = {12.50, 0, 20.0, 7.50, 0, 30.0};
        double total = 0;
        int precoZero = 0;
        int precoDiferenteZero = 0;
        int quantidade = 0;
        for (double preco : precos) {
            if (preco == 0){
                precoZero ++;
                continue;
            }
            System.out.println("Preço: R$ "+ preco);

            total += preco;
            if (preco != 0){
                precoDiferenteZero ++;

            }
            quantidade = precoDiferenteZero;

        }
        System.out.println("Total: R$ "+ total);
        System.out.println("Preço em zero: "+ precoZero);
        System.out.println("Preço diferente de zero: "+ precoDiferenteZero);
        System.out.println("Quantidade: " + quantidade);
    }
}
