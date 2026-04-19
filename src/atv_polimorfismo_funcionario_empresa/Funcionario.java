package atv_polimorfismo_funcionario_empresa;

public abstract class Funcionario {
    //atributos
    public String nome;
    public int idade;

    //construtor
    public Funcionario(String nome,int idade){
        this.nome=nome;
        this.idade=idade;
    }
    //metodos

    public abstract double calcularSalario();
}
