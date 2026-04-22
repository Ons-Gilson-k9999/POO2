package Atv5_PolimorfismocomClasseAbstrata;

public class PagamentoPix extends Pagamento {
    //atributos
    public double valor;
    //construtor
    public PagamentoPix(String pagamento,double valor){
        super(pagamento);
        this.valor = valor;
    }
    //metodos
    @Override
    public double processarPagamento(){
        return valor;
    }
}
