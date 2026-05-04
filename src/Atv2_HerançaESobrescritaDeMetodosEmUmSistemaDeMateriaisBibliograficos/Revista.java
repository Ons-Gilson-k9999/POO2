package Atv2_HerançaESobrescritaDeMetodosEmUmSistemaDeMateriaisBibliograficos;

public class Revista extends MaterialBibliografico{
    //atributos
    private String mesAnoEdicao;
    //construtor
    public Revista(String modelo,String isbn,String mesAnoEdicao){
        super(modelo,isbn);
        this.mesAnoEdicao=mesAnoEdicao;
    }
    public void setMesAnoEdicao(String mesAnoEdicao){
        this.mesAnoEdicao=mesAnoEdicao;
    }
    public String getMesAnoEdicao(){
        return mesAnoEdicao;
    }

    //metodos
    @Override
    public void emprestar(){
        System.out.println(" A revista com o: "+getTitulo()+" da edição:"+mesAnoEdicao+" foi emprestada");
    }

}
