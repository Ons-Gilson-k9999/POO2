package Atv_21_collections;

public class Main {
public static void main(String[] args){
    Agenda lista = new Agenda();

    Contato contato1 = new Contato(" Gilson ");
    Contato contato2 = new Contato(" Arthur ");
    Contato contato3 = new Contato(" Kailane ");

    lista.adicionarContato(contato1);
    lista.adicionarContato(contato2);
    lista.adicionarContato(contato3);

    lista.listarContatos();

    lista.removerContato(contato1);

    lista.listarContatos();
}
}
