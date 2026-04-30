package atv16_interface_registrarHorario;

public class Professor extends Funcionario implements PresencaRegistravel{
    //atributos
    private String disciplina;
    //construtor
    public Professor(String nome,String disciplina){
        super(nome);
        this.disciplina = disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina=disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }
    //metodos
    @Override
    public void exibirDados(){
        System.out.println(" Nome: "+getNome());
    }
    public void lecionar(){
        System.out.println(" O professor: "+getNome()+" está lecionando a disciplina: "+disciplina);
    }
    public void registrarPresenca(){
        System.out.println("A presença do professor: "+getNome()+" foi registrada !");
    }
}
