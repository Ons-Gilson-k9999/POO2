package Atv_30_excecoesTratamento;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(300, 250);
        try {
            c1.depositar(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(" Erro, deposito invalido, o valor deve ser positivo. ");
        }
        try {
            c1.depositar(0);
        } catch (IllegalArgumentException e) {
            System.out.println(" Erro, deposito inválido, os valores devem ser maiores que zero. ");
        }
        c1.depositar(200);
        System.out.println(" Deposito realizado com sucesso !");
        System.out.println(" O Saldo atual: " + c1.getSaldo());
    }
}