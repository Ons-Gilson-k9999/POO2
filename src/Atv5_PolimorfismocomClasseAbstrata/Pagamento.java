package Atv5_PolimorfismocomClasseAbstrata;

public abstract class Pagamento {
    //atributos
    public String pagamento;
    //construtor
    public Pagamento(String pagamento){
        this.pagamento = pagamento;
    }
    //metodos
    public abstract double processarPagamento();
}