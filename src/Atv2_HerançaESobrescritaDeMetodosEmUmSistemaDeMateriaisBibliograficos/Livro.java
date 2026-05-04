package Atv2_HerançaESobrescritaDeMetodosEmUmSistemaDeMateriaisBibliograficos;

public class Livro extends MaterialBibliografico {
    //atributos
    private String autor;
    private String isbn;
    //construtor
    public Livro(String titulo,String codigo,String autor,String isbn){
        super(titulo,codigo);
        this.autor=autor;
        this.isbn=isbn;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setIsbn(String Isbn){
        this.isbn=isbn;
    }
    public String getIsbn() {
        return isbn;
    }
    //metodos
    @Override
    public void emprestar(){
        System.out.println(" O livro de titulo:"+getTitulo()+" do autor: "+autor+" com o codigo: "+getCodigo()+" com o isbn: "+isbn+" foi emprestado");
    }
}
