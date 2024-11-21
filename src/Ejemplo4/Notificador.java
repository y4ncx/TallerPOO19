package Ejemplo4;

public class Notificador {
    private EmailService emailService;
    public Notificador(EmailService emailService) {
        this.emailService = emailService;
    }
}
public void notificar(String destinatario, String mensaje) {
    emailService.enviarMensaje(destinatario, mensaje);
}
