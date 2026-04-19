package Atv_4PolimorfismocomClasseAbstrata;

public abstract class Veiculo {
    //atributos
    public String modelo;
    //construtor
    public Veiculo(String modelo){
        this.modelo = modelo;
    }
    //metodos
    public abstract void mover();
}
