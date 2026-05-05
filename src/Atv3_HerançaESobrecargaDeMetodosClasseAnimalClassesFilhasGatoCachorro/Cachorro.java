package Atv3_HerançaESobrecargaDeMetodosClasseAnimalClassesFilhasGatoCachorro;

public class Cachorro extends Animal{
    //atributos
    private String porte;
    //construtor
    public Cachorro(String nome,int idade,String porte){
        super(nome,idade);
        this.porte=porte;
    }
    public void setPorte(String porte){this.porte=porte;}
    public String getPorte(){return porte;}
    //metodos
    public void correr(){System.out.println(getNome()+" está correndo. ");}
    public void correr(int distancia){System.out.println(getNome()+" está percorrendo uma distancia enorme");}

}
