package pooF.dominio;

public interface Imprimivel {
    void imprimir(String documento);
    default void imprimirCopia(String documento){
        System.out.println("copia do documento: "+ documento);
    }
}
