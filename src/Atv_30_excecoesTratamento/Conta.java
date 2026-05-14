package Atv_30_excecoesTratamento;

public class Conta {
    //atributos
    private double saldo;
    private double limite;

    //construtor
    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    //metodos
    public void depositar(double valor) {
        //validar o deposito
        if (valor <= 0){
            throw new IllegalArgumentException(" O valor do depósito deve ser maior que zero. ");
        } else {
            saldo = valor + saldo;
            System.out.println(" Valor depositado com sucesso.");
        }
    }


}