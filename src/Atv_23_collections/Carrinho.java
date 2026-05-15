package Atv_23_collections;

import java.util.ArrayList;
    //atributos
public class Carrinho {
    private ArrayList<Produto> lista;
    //construtor
    public Carrinho(){
        this.lista= new ArrayList<>();
    }
    //metodos
    public void adicionarProdutos(Produto produto){
        lista.add(produto);
        System.out.println(" O produto: "+produto.getNome()+" foi adicionado com sucesso. ");
    }
    public void removerProdutos(Produto produto){
        lista.remove(produto);
        System.out.println(" O produto: "+produto.getNome()+" foi removido com sucesso. ");
    }
    public void listarProdutos(){
        for(Produto produto: lista)
        System.out.println(" Lista de produtos cadastrados: "+produto.getNome());
    }
    public void mostrarQuantidade(){
        for(Produto produto: lista)
        System.out.println(" Quantidade de produtos cadastrados: "+lista.size());
    }
}
