package atv_polimorfismo_funcionario_empresa;

public class Main {
    static void main(String[] args) {
        FuncionarioCLT f1 = new FuncionarioCLT("Gilson", 31, 5400);
        f1.exibirInformacoes();
        System.out.println(" O salario de "+f1.nome+" é :"+f1.calcularSalario());
        FuncionarioFreelancer f2 = new FuncionarioFreelancer("Artur", 20, 50, 200);
        f2.exibirInformacoes();
        System.out.println(" O salario de "+f2.nome+" é :"+f2.calcularSalario());
    }

}
