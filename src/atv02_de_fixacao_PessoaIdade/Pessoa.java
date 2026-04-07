package atv02_de_fixacao_PessoaIdade;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
    }

    public void mostrarDados() {
            System.out.println("nome: " + this.nome);
            System.out.println("Idade: " + this.idade);

    }
}
