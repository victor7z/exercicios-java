package exercicios;

public class FrutasCestas {
    static void main(String[] args) {
        String [][] cestas = {
                {"maçã", "Banana"}, {"Uva", "Morango", "Pera"}
        };

        for (String[] frutas : cestas){
            System.out.println("Cesta:");
            for (String fruta : frutas){
                System.out.println(fruta);

            }
        }
    }

}
