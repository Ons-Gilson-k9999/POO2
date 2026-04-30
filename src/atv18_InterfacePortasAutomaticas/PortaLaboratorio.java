package atv18_InterfacePortasAutomaticas;

public class PortaLaboratorio implements PortaAutomatica {
    //metodos
    @Override
    public void abrirPorta(){
        System.out.println(" A porta do laboratório está aberta. ");
    }
}
