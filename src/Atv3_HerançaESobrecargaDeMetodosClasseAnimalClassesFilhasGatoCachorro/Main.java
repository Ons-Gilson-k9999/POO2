package Atv3_HerançaESobrecargaDeMetodosClasseAnimalClassesFilhasGatoCachorro;

public class Main {
    public static void main(String[] args){
        Gato g1=new Gato("Amadeus",3,"escura");
        g1.emitirSom();
        g1.emitirSom(" miau");
        g1.brincar();
        g1.brincar(" Dinossauro de brinquedo");
        Cachorro c1=new Cachorro("Dino",3,"Atlético");
        c1.emitirSom();
        c1.emitirSom(" au au au");
        c1.correr();
        c1.correr(200);
    }

}
