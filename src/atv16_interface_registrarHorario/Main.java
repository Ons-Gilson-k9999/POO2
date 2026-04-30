package atv16_interface_registrarHorario;

public class Main {
    public static void main (String[] args){
        Diretor d1 = new Diretor("Alexandre","Administração");
        d1.exibirDados();
        d1.tomarDecisao();
        Professor p1 = new Professor("Micael","Calculo I");
        p1.exibirDados();
        p1.lecionar();
        Secretaria s1 = new Secretaria("Samantha","Matutino");
        s1.exibirDados();
        s1.organizarDocumento();
        Terceirizado t1 = new Terceirizado("José");
        t1.mostrarDados();
        t1.executarServico();
    }
}
