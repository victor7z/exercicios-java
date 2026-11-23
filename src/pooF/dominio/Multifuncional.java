package pooF.dominio;

public class Multifuncional implements Imprimivel, Escaneavel{
    @Override
    public void imprimir(String documento){
        System.out.println("Imprimindo: "+documento);
    }

    @Override
    public void escanear(String documento){
        System.out.println("Escaneando: "+documento);
    }

    @Override
    public void imprimirCopia(String documento){
        System.out.println("Multifuncional copiando: "+ documento);
    }
}
