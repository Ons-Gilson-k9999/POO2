package Atv2_HerançaESobrescritaDeMetodosEmUmSistemaDeMateriaisBibliograficos;

public class Main {
    public static void main(String[] args){
        Livro l1=new Livro("Noites Brancas","12335/OC","Fiodor Dostoievsky","12345678910");
        l1.emprestar();
        Revista r1 = new Revista(" Planeta hulk","0987654321","05/03/2008");
        r1.emprestar();
        MidiaDigital md1=new MidiaDigital(" Invincible ","5647382910","Mídia Digital","5.000 mb",506);
        md1.emprestar();
    }
}
