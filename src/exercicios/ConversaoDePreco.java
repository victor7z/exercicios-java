package exercicios;

public class ConversaoDePreco {
    public static void main (String[] args){
        double preco = 19.99;
        int precoInteiro = (int) preco;
        double preccoConvertido = precoInteiro;

        System.out.println("Preço:"+ preco);
        System.out.println("Preço inteiro:"+ precoInteiro);
        System.out.println("Preço convertido:"+ preccoConvertido);
    }
}
