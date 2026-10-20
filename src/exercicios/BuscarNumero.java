package exercicios;

public class BuscarNumero {
    static void main(String[] args) {
        int [] numeros = {8, 15, 23, 4, 42, 16};
        int numeroProcurado= 23;
        boolean encontrado = false;
        int tentativasRealizadas = 0;

        System.out.println("Numero procurado: "+ numeroProcurado);

        for (int numero : numeros){
            System.out.println("Verificando: "+ numero);
            tentativasRealizadas++;
            if (numero == numeroProcurado){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            System.out.println("Número " + numeroProcurado+" encontrado");
        }
        else {
            System.out.println("Numero " +numeroProcurado+" não encontrado");
        }
        System.out.println("Tentativas realizadas para encontrar o numero: "+tentativasRealizadas);
    }
}
