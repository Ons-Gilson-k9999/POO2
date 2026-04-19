package Atv3_Polimorfismo_com_Classe_Abstrata;

public class Retangulo extends Forma {
    //atributos
    public double base;
    public double altura;
    //construtor
    public Retangulo(String nome,double base,double altura){
        super(nome);
        this.base= base;
        this.altura= altura;
    }
    //metodos
    @Override
    public double calcularArea(){
        return base* altura;
    }
}
