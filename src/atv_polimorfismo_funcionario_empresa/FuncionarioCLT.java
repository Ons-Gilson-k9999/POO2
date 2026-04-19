package atv_polimorfismo_funcionario_empresa;

public class FuncionarioCLT extends Funcionario{
    //atributos
    public double salario;
    //construtor
    public FuncionarioCLT(String nome,int idade,double salario){
        super(nome,idade);
        this.salario=salario;
    }
    //metodos

    public void exibirInformacoes(){
        System.out.println(" Nome: "+nome);
        System.out.println(" Idade:  "+idade);
    }
    @Override
    public double calcularSalario() {
        return salario;
    }
}

