package Atv_4PolimorfismocomClasseAbstrata;

public class Carro extends Veiculo{
    //atributos
    public String modelo;
    //construtor
    public Carro(String modelo){
        super(modelo);
        this.modelo=modelo;
    }
    //metodos
    @Override
    public void mover(){
        System.out.println(" O "+this.modelo+ " esta se movendo via motor!");
    }

}
