package Atv_20_colections;
import java.util.ArrayList;

public class ListaCompras {
    //atributos
    private ArrayList<Item> lista;
    //Construtor
    public ListaCompras(){
        lista = new ArrayList<>();
    }
    public void adicionarItem(Item item) {
        lista.add(item);
        System.out.println("Item adicionado" +item.getNome());
    }
        public void removerItem(Item item) {
            lista.remove(item);
            System.out.println(" Item removido" +item.getNome());
    }
        public void mostrarItem(){
            System.out.println("Lista de Compras");
            for (Item item: lista)  //Item por item dessa Lista//
                System.out.println(item.getNome());
    }
}
