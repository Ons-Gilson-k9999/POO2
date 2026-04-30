package Atv17_interfaceMensagem;

public class Email implements Notificacao {
    //atributos
    //construtor
    //metodos

    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada por email");
    }
}
