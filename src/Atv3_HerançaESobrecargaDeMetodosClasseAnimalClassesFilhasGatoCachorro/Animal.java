package Atv3_HerançaESobrecargaDeMetodosClasseAnimalClassesFilhasGatoCachorro;

public class Animal {
    //atributos
    protected String nome;
    protected int idade;
    //Construtor
    public Animal(String nome,int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public void setNome(String nome){this.nome=nome;}
    public String getNome(){return nome;}
    public void setIdade(int idade){this.idade=idade;}
    public int getIdade(){return idade;}
    //metodos
    public void emitirSom(){System.out.println(nome+" está emitindo um som.");}

    public void emitirSom(String som){System.out.println("O tipo de som que: "+nome+" faz,é um som produzindo vibrações no peito.");}

}
