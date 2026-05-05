package Atv3_HerançaESobrecargaDeMetodosClasseAnimalClassesFilhasGatoCachorro;

public class Gato extends Animal{
    //atributos
    private String corPelagem;
    //construtor
    public Gato(String nome,int idade, String corPelagem){
        super(nome,idade);
        this.corPelagem=corPelagem;
    }
    public void setCorPelagem(String corPelagem){this.corPelagem=corPelagem;}
    public String getCorPelagem(){return corPelagem;}
    //metodos
    public void brincar(){System.out.println(getNome()+" está brincando.");}
    public void brincar(String brincar){System.out.println(getNome()+" esta brincando com o Dinossauro de brinquedo.");}

}
