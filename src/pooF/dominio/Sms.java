package pooF.dominio;

public class Sms implements Notificador{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Sms: "+ mensagem);
    }
}
