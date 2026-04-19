package Atv_4PolimorfismocomClasseAbstrata;

public class Bicicleta extends Veiculo {
    //atributos
    public String modelo;
    //construtor
    public Bicicleta(String modelo){
        super(modelo);
        this.modelo = modelo;
    }
    //metodos
    @Override
    public void mover(){
        System.out.println(" A " +modelo+" esta se movendo via pedalo! ");
    }
}

