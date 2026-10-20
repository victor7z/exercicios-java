package exercicios;

public class RevisaoPrecos {
    static void main(String[] args) {
        double [] precos = new double [4];

        precos[0] = 10.0;
        precos[1] = 25.0;
        precos[2] = 15.0;
        precos[3] = 30.0;
        precos[1] = 20.0;
        double total = 0;
        int ateVinte = 0;
        int acimaDeVinte =0;
        precos[2] = 0;

        for (int i = 0; i < precos.length ; i++) {
            if (precos[i] == 0.0){
                continue;
            }
            if (precos[i] <= 20.0){
                ateVinte++;
            }
            else {
                acimaDeVinte++;
            }
            System.out.println("Produto "+(i+1)+ ": R$ "+precos[i]);
            total += precos[i];
        }
        System.out.println("total: "+total);
        System.out.println("Produtos de até R$ 20: "+ ateVinte);
        System.out.println("Produtos acima de R$ 20: "+ acimaDeVinte);
    }
}
