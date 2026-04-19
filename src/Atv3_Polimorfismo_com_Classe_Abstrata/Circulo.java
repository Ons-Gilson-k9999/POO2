package Atv3_Polimorfismo_com_Classe_Abstrata;

public class Circulo extends Forma {
    //atributos
    public double raio;
    //construtor
    public Circulo(String nome,double raio){
        super(nome);
        this.raio = raio;
    }
    //metodos

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }
}
