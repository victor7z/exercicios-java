package pooF.dominio;

public interface Calculadora {
    double TAXA = 0.10;

    double calcularValor(double valor);
    static void mostrarTaxa(){
        System.out.println("Taxa: "+ TAXA);
    }
}
