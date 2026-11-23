package pooF.dominio;

public class Emails implements Notificador{
    @Override
    public void enviar(String mensagem) {
        System.out.println("email: "+ mensagem);
    }
}
