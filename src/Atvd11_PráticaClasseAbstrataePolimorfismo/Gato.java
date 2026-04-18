package Atvd11_PráticaClasseAbstrataePolimorfismo;

public class Gato extends Animal {
    //atributos
    public String somDoRonronar;
    //construtor
    public Gato(String somDoRonronar,String nome){
        super(nome);
        this.somDoRonronar =somDoRonronar;
    }
    //metodos
    public void soltarPelo(){
        System.out.println(nome+" Corre de tal forma que enche a casa de pelos! ");
    }
    @Override
    public void emitirSom(){
        System.out.println(nome+ " diz: Miaaau !");
    }

    public void mover(){
        System.out.println(nome+ " está saltando agilmente !");
    }
}
