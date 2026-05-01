package Atv3_CriandoeUtilizandoumaClasseFloremJava;

public class Flor {
    //atributos
    public String nome;
    public String cor;
    public boolean possuiPerfume;

    //construtor
    public Flor(String nome, String cor, boolean possuiPerfume) {
        this.nome = nome;
        this.cor = cor;
        this.possuiPerfume = possuiPerfume;
    }

    //metodos
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);

        if (possuiPerfume) {
            System.out.println("Possui perfume: sim ");
        } else {
            System.out.println("Possui perfume: nao");

        }
    }
}