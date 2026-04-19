package Atv3_Polimorfismo_com_Classe_Abstrata;

public class Main {
    public static void  main(String[] args){
        Retangulo r1 = new Retangulo("Retangulo",5,4);

        Circulo c1 = new Circulo("Circulo",3);

        System.out.println(" A área do " +r1.nome+" é: "+r1.calcularArea());
        System.out.println(" A área do " +c1.nome+" é: "+c1.calcularArea());
    }
}
