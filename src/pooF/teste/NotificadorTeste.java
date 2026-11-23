package pooF.teste;

import pooF.dominio.Emails;
import pooF.dominio.Notificador;
import pooF.dominio.Sms;

public class NotificadorTeste {
    static void main(String[] args) {
        Emails email = new Emails();
        Sms sms = new Sms();
        email.enviar("pedido enviado");
        sms.enviar("pedido enviado");
    }
}
