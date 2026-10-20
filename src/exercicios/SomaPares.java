package exercicios;

public class SomaPares {
    static void main(String[] args) {
        int limite = 10;
        int somap = 0;
        int somai = 0;

        for (int i = 1; i <= limite ; i++) {
            if (i % 2 ==0){
                System.out.println("Números: "+ i);
                somap += i ;
            }
            else {
                System.out.println("Números: "+ i);
                somai += i ;
            }
        }
        System.out.println("Soma dos Pares: "+ somap);
        System.out.println("Soma dos ImPares: "+ somai);
    }
}
