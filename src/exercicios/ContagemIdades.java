package exercicios;

public class ContagemIdades {
    static void main(String[] args) {
        int [] idades =  new int [5];
        int maiores = 0;
        int menores = 0;
        idades [0] = 15;
        idades [1] = 19;
        idades [2] = 17;
        idades [3] = 22;
        idades [4] = 18;

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 18){
                System.out.println("Pessoa "+(i+1)+ ": " + idades[i] + " Anos - Maior de idade");
                maiores++;
            }
            else {
                System.out.println("Pessoa "+ (i+1) + ": "+ idades[i]+ " Anos - Menor de idade");
                menores++;
            }

        }
        System.out.println("Quantidades de Pessoas maiores de Idade: "+ maiores);
        System.out.println("Quantidades de Pessoas menores de Idade: "+ menores);
    }

    public static class CompraMaterial {
        public static void main (String[] args){
            int quantidadeCadernos = 4;
            double precoCaderrno = 12.50;
            int quantidadeCanetas = 3;
            double precoCanetas = 4;
            double pagamentoRecebido = 100;
            double troco = 0;
            double subtotalCadernos = quantidadeCadernos * precoCaderrno;
            double subtotalCanetas = quantidadeCanetas * precoCanetas;
            double subtotal = subtotalCadernos + subtotalCanetas;
            if (pagamentoRecebido >= subtotal){
                troco = pagamentoRecebido - subtotal;
                System.out.println("Preço Total Cadernos: "+subtotalCadernos + "Quant: "+quantidadeCadernos);
                System.out.println("Preço Total Canetas: "+subtotalCanetas + "Quant: "+quantidadeCanetas);
                System.out.println("Pagamento Recebido: "+ pagamentoRecebido);
                System.out.println("Subtotal Da Compra: "+ subtotal);
                System.out.println("troco: "+ troco);


            }
            else {
                System.out.println("Saldo insuficiente");
            }

        }
    }
}
