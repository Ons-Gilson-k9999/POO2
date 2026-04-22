package Atv5_PolimorfismocomClasseAbstrata;

public class Main {
    public static void main(String[] args){
        PagamentoCartao p1 = new PagamentoCartao("Cartão",5600);
        p1.processarPagamento();
        System.out.println("O pagamento de: "+p1.valor+" realizado com: "+p1.pagamento);
        PagamentoPix p2 = new PagamentoPix("Pix", 3000);
        p2.processarPagamento();
        System.out.println("O pagamento de: "+p2.valor+" realizado com: "+p2.pagamento);
    }
}
