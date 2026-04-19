package Atv_4PolimorfismocomClasseAbstrata;

public class Main {
    public static void main(String[] args){
        Carro c1= new Carro("Celta");
        c1.mover();
        Bicicleta b1 = new Bicicleta("Caloi");
        b1.mover();
    }
}
