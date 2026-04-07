package atv01_Associacao_CarroPessoa;

public class Main {
public static void main(String[] args) {
    //pessoa
    Pessoa pessoa1 = new Pessoa(" João ", 31, 5598766, 123456789);
    pessoa1.usarCarro();
    pessoa1.ligarCarro();
    pessoa1.dirigirCarro();
    pessoa1.desligarCarro();
    //carro
    Carro carro1 = new Carro("O Fusca", "OTB-0988", "12345678910", 1996);
    carro1.ligar();
    carro1.dirigir();
    carro1.frear();
    carro1.desligar();
    }
}
