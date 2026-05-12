package Atv_21_collections;
import java.util.ArrayList;

public class Agenda{
    //atributos
    private ArrayList<Contato> lista;
    //construtor
    public Agenda(){
        this.lista=new ArrayList<>();
    }
    //metodos
    public void adicionarContato(Contato contato){
        lista.add(contato);
        System.out.println(" O contato: "+contato.getNome()+" foi adicionado à lista.");
    }
    public void removerContato(Contato contato){
        lista.remove(contato);
        System.out.println(" O contato: "+contato.getNome()+" foi removido.");
    }
    public void listarContatos(){
        System.out.println(" Lista de contatos:");
            for(Contato contato: lista)
            System.out.println(contato.getNome());

    }
}
