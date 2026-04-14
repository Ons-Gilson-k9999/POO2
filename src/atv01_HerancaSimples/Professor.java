package atv01_HerancaSimples;

public class Professor extends Pessoa{
    //atributos
    private String disciplina;
    //construtor
    public Professor(String nome,int idade,String disciplina){
        super(nome,idade);
        this.disciplina = disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }
    //metodos
    public void ensinar(){
        System.out.println("A disciplina ministrada é: calculo");
    }
}
