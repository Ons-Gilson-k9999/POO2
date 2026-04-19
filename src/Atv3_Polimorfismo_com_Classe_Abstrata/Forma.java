package Atv3_Polimorfismo_com_Classe_Abstrata;

public abstract class Forma {
    //atributos
    public String nome;
    //construtor
    public Forma(String nome){
        this.nome= nome;
    }
    //metodos
    public abstract double calcularArea();
}
