package Atvd11_PráticaClasseAbstrataePolimorfismo;

public class Vaca extends Animal {
    //atributos
    public String corDoChifre;
    //construtor
    public Vaca (String corDoChifre,String nome){
        super(nome);
        this.corDoChifre = corDoChifre;
    }
    //metodos
    public void espantarMoscas(){
        System.out.println(nome+" Está a balançar o rabo e a cabeça, espantando moscas! ");
    }
    @Override
    public void emitirSom(){
        System.out.println(nome+ " diz: Muuu!" );
    }

    public void mover(){
        System.out.println(nome+ " está andando pelo pasto.");
    }
}
