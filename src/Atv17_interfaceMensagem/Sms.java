package Atv17_interfaceMensagem;

public class Sms implements Notificacao {
    //atributos
    //construtor
    //metodos

    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada por sms");
    }
}
