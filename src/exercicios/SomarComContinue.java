package exercicios;

public class SomarComContinue {
    static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <=10 ; i++) {
            if (i == 4 || i ==7){
                continue;
            }
            soma += i;
            System.out.println(i);
        }
        System.out.println("Soma: "+soma);
    }
}
