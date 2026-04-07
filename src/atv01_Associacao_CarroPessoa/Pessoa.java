package atv01_Associacao_CarroPessoa;

public class Pessoa {
        //atributos
        private String nome;
        private int idade;
        private int identidade;
        private int cnh;
        //construtor
        public Pessoa(String nome,int idade,int identidade,int cnh){
            this.nome = nome;
            this.idade = idade;
            this.identidade = identidade;
            this.cnh = cnh;
        }
        //metodos
        public void usarCarro(){
            System.out.println(nome +"esta usando o carro.");
        }
        public void ligarCarro(){
            System.out.println(nome +"está ligando o carro.");
        }
        public void dirigirCarro(){
            System.out.println(nome +"está dirigindo o carro.");
        }
        public void desligarCarro(){
            System.out.println(nome +"esta desligando o carro.");
        }

}
