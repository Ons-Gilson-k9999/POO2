package atv19_interfaceEquipamentosInteligentesEscola;

public class ProjetorInteligente implements Ligavel,Conectavel {
    //metodos

    @Override
    public void ligar(){
        System.out.println("Projetor ligado com sucesso.");
    }

    @Override
    public void conectarInternet(){
        System.out.println("Pojetor conectado à internet.");
    }
}
