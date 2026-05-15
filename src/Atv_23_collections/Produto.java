package Atv_23_collections;

public class Produto {
    //atributos
    private String nome;
    private double preco;
    //construtor
    public Produto(String nome,double preco){
        this.nome=nome;
        this.preco=preco;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    //metodos
    public void mostrarProduto(){
        System.out.println(" Nome do produto: "+nome);
        System.out.println(" Preço do produto: "+preco);
    }

}
