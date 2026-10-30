package poo;

public class EstacaoMeteorologica {
    public String cidade;


    public void definirCidade(String cidade){
        this.cidade = cidade;
    }

    public double calcularMedia(double... temperaturas){
        double totalTemperaturas = 0;
        for (int i = 0; i < temperaturas.length ; i++) {
            totalTemperaturas += temperaturas[i];
        }
        if (temperaturas.length == 0){
            return 0;
        }
        return totalTemperaturas/ temperaturas.length;

    }

    public void exibirRelatorio(double... temperaturas){
        double media = calcularMedia(temperaturas);
        System.out.println("Cidade: "+ cidade);
        System.out.println("Medições: "+ temperaturas.length );
        System.out.println("Media: "+ media);
    }
}
