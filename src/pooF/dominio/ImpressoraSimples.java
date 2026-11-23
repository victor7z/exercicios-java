package pooF.dominio;

public class ImpressoraSimples implements Imprimivel{

    @Override
    public void imprimir(String documento) {
        System.out.println("Impressora simples imprimindo: " + documento);
    }
}
