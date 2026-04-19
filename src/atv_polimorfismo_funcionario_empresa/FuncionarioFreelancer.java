package atv_polimorfismo_funcionario_empresa;

public class FuncionarioFreelancer extends Funcionario {
    //atributos
    public double valorHora;
    public double horasTrabalhado;
    //construtor
    public FuncionarioFreelancer(String nome,int idade,double valorHora,double horasTrabalhado){
        super(nome,idade);
        this.valorHora = valorHora;
        this.horasTrabalhado=horasTrabalhado;
    }

    //metodos

    public void exibirInformacoes(){
        System.out.println(" Nome: "+nome);
        System.out.println(" Idade:  "+idade);
    }
    @Override
    public double calcularSalario() {
        return horasTrabalhado * valorHora;
    }
}
