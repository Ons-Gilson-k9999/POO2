package atv16_interface_registrarHorario;

public class Terceirizado implements PresencaRegistravel {
    //atributos
    protected String nome;
    //Construtor
    public Terceirizado(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    //metodos
    public void mostrarDados(){
        System.out.println("Nome: "+nome);
    }
    public void executarServico(){
        System.out.println(nome+" está executando serviços terceirizados ");
    }
    public void registrarPresenca(){
        System.out.println("A presença de: "+nome+" foi registrada !");
    }
}
