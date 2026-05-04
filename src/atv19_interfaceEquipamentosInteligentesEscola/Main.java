package atv19_interfaceEquipamentosInteligentesEscola;

public class Main {
    public static void main(String[] args){
        Ligavel l1= new ProjetorInteligente();
        l1.ligar();

        Conectavel c1=new ProjetorInteligente();
        c1.conectarInternet();

    }
}
