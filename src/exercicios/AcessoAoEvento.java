package exercicios;

public class AcessoAoEvento {
    public static void main (String[] args){
        int idade = 19;
        boolean temIngresso = true;
        boolean estaNaListaVip = false;
        boolean estaBloqueado = false;
        String sim = "Sim";
        String nao = "Não";
        String result01 = (idade >=18 && temIngresso? sim : nao);
        String result02 = (temIngresso || estaNaListaVip? sim : nao);
        String result03 = (!estaBloqueado? nao : sim);
        boolean podeEntrar = idade >=18 && (temIngresso || estaNaListaVip) && !estaBloqueado;

        System.out.println("Tem 18 anos ou mais e tem ingresso? "+ result01);
        System.out.println("Tem ingresso ou está na lista VIP? "+ result02);
        System.out.println("Está bloqueado? "+ result03);
        if (podeEntrar){
            System.out.println("Acesso liberado!");
        }
        else{
            System.out.println("Acesso Negado!");
        }

    }
}
