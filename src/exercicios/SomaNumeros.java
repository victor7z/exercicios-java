package exercicios;

public class SomaNumeros {
    static void main(String[] args) {
        int limite = 5;
        int soma = 0;


        for (int i = 1; i <= limite ; i++) {
            soma += i ;
            System.out.println("Número: "+ i);

        }
        System.out.println("Soma Final: "+soma);
    }
}
