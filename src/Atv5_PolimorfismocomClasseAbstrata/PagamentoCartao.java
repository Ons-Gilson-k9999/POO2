package Atv5_PolimorfismocomClasseAbstrata;

public class PagamentoCartao extends Pagamento {
    //atributos
    public double valor;
    //construtor
    public PagamentoCartao(String pagamento,double valor){
        super(pagamento);
        this.valor = valor;
    }
    //metodos
    @Override
    public double processarPagamento(){
        return valor;
    }
}
