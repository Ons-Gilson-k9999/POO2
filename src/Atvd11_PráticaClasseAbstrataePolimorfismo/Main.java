package Atvd11_PráticaClasseAbstrataePolimorfismo;

public class Main{
    public static void main (String[] args){
        Papagaio papagaio = new Papagaio("cinza dourado","Poeta");
        papagaio.emitirSom();
        papagaio.afiarbico();
        papagaio.mover();
        Vaca vaca = new Vaca("Cinza metalico","Gizelda");
        vaca.emitirSom();
        vaca.espantarMoscas();
        vaca.mover();
        Gato gato = new Gato("Alto e vibrante","Anúbis");
        gato.emitirSom();
        gato.mover();
        gato.soltarPelo();
    }
}