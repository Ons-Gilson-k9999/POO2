package Atv_23_collections;

public class Main {
    public static void main(String[] args){
        Carrinho lista = new Carrinho();

        Produto p1= new Produto("Bolacha",3.50);
        Produto p2= new Produto("Leite", 5.00);
        Produto p3= new Produto("Arroz", 16.00);

        lista.adicionarProdutos(p2);
        lista.adicionarProdutos(p1);
        lista.adicionarProdutos(p3);

        lista.listarProdutos();

        lista.removerProdutos(p1);

        lista.listarProdutos();

        lista.mostrarQuantidade();

    }
}
