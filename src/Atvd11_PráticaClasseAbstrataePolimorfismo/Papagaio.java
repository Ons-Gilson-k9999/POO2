package Atvd11_PráticaClasseAbstrataePolimorfismo;

public class Papagaio extends Animal {
    //atributos
    public String corDoBico;
    //Construtor
    public Papagaio(String corDoBico,String nome){
        super(nome);
        this.corDoBico = corDoBico;
    }
    //metodos
    public void afiarbico(){
        System.out.println(nome+ " Está afiando o bico na arvore...que curioso.");
    }

    public void emitirSom(String frase){
        System.out.println(" olá Humanos, ha ha há!");
    }
    @Override
    public void emitirSom(){
        System.out.println(nome+ " diz: Curupaco !");
    }
    public void mover(){
        System.out.println(nome+" está voando pelos céus");
    }
}
