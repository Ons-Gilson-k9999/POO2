package atv18_InterfacePortasAutomaticas;

public class Main {
    public static void main (String[] args){
        PortaAutomatica p1= new PortaSala();
        p1.abrirPorta();
        PortaAutomatica p2= new PortaLaboratorio();
        p2.abrirPorta();



    }
}
