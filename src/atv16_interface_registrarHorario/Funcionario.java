package atv16_interface_registrarHorario;

public class Funcionario {
    //atributos
    protected String nome;
    //Construtor
    public Funcionario (String nome){
        this.nome=nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    //metodos
    public void exibirDados(){
        System.out.println(" Nome: "+nome);
    }
}
