package ProvaGilson.Equipamento;

public class Equipamento {
    //atributos
    public int id;
    public String patrimonio;
    public String descricao;
    public String fabricante;
    public int quantidade;
    //construtor
    public Equipamento(int id,String patrimonio,String descricao,String fabricante,int quantidade){
        this.id= id;
        this.patrimonio=patrimonio;
        this.descricao=descricao;
        this.fabricante=fabricante;
        this.quantidade=quantidade;
    }
    public void setId(int id){
        this.id=id;
    }
    int getId(){
        return id;
    }
    public void setPatrimonio(String patrimonio){
        this.patrimonio=patrimonio;
    }
    String getPatrimonio(){
        return patrimonio;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    String getDescricao(){
        return descricao;
    }
    public void setFabricante(String fabricante){
        this.fabricante=fabricante;
    }
    String getFabricante(){
        return fabricante;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    int getQuantidade(){
        return quantidade;
    }
}
