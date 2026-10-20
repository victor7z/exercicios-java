package exercicios;

public class ControleDeVendas {
    static void main(String[] args) {
        double [][] filiais = {
                {150.0, 200.0, 100.0}, {300.0, 250.0}, {120.0, 180.0, 220.0, 160.0}
        };

        int numFiliais =0;
        double faturamento = 0;
        int utrapassou200 = 0;
        double filialCampea = 0;
        int numCampea = 0;
        int numTotalvendas = 0;




        for (double[] filial : filiais){

            System.out.println("===== FILIAL "+(1+numFiliais++) + " =======");
            int numvenda = 0;
            double totalFilial = 0;

            for (double vendas : filial){
                System.out.println("Venda "+ (1+numvenda++)+ ": R$ " + vendas);
                totalFilial += vendas;
                 numTotalvendas ++;
                if (vendas > 200){
                    utrapassou200++;
                }
            }
            System.out.println("Total de Vendas Da Filial: R$ "+ totalFilial);
            faturamento += totalFilial;

            if (totalFilial > filialCampea ){
                filialCampea = totalFilial;
                numCampea = numFiliais;
            }
        }


        System.out.println("=====================");
        System.out.println("Faturamento total das Filiais: R$ "+ faturamento);
        double mediaVendas = faturamento / numTotalvendas;
        System.out.print("Media de Vendas R$ ");
        System.out.printf("%.2f",mediaVendas);
        System.out.println("\nQuantas vendas passaram de R$ 200: "+ utrapassou200);
        System.out.println("A filial Que mais faturou foi a "+ numCampea+ " Filial, Com: R$ "+ filialCampea);





    }
}
