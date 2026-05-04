package Atv2_HerançaESobrescritaDeMetodosEmUmSistemaDeMateriaisBibliograficos;

public class MaterialBibliografico {
    //atributos
    private String titulo;
    private String codigo;
    //construtor
    public MaterialBibliografico(String titulo,String codigo){
        this.titulo=titulo;
        this.codigo=codigo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public String getCodigo(){
        return codigo;
    }
    //metodos
    public void emprestar(){
        System.out.println("O material foi emprestado atravez do: "+titulo);
    }

}
