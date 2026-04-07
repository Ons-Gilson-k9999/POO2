package atv01_Associacao_CarroPessoa;

public class Carro {
        //atributos
        private String modelo;
        private String placa;
        private String crv;
        private int ano;

        //construtor
        public Carro(String modelo, String placa, String documetação, int ano) {
            this.modelo = modelo;
            this.placa = placa;
            this.crv = crv;
            this.ano = ano;
        }

        //metodos
        public void ligar() {
            System.out.println(modelo + " esta ligando " );
        }

        public void dirigir() {
            System.out.println(modelo+" esta dirigindo. ");
        }

        public void frear() {
            System.out.println(modelo+" esta freando. ");
        }

        public void desligar() {
            System.out.println(modelo+" esta desligando.");
        }

}
