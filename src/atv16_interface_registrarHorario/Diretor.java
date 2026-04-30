package atv16_interface_registrarHorario;

public class Diretor extends Funcionario {
    //atributos
    private String setor;
    //construtor
    public Diretor(String nome, String setor){
        super(nome);
        this.setor=setor;
    }
    public void setSetor(String setor){
        this.setor=setor;
    }
    public String getSetor(){
        return setor;
    }
    //metodos
    @Override
    public void exibirDados(){
        System.out.println("nome: "+getNome());
    }
    public void tomarDecisao(){
        System.out.println(" O Diretor:"+getNome()+" está tomando a decisão no(a): "+setor);
    }
}
