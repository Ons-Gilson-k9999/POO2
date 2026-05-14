package Atv_22_collections;

import java.util.ArrayList;

public class ListaTarefas {
    //atributos
    private ArrayList<Tarefa> lista;
    //construtor
    public ListaTarefas(){
        this.lista= new ArrayList<>();
    }
    //metodos
    public void adicionarTarefa(Tarefa tarefa){
        lista.add(tarefa);
        System.out.println("A tarefa: "+tarefa.getDescricao()+" , foi adicionada com sucesso!" );
    }
    public void removerTarefa(Tarefa tarefa){
        lista.remove(tarefa);
        System.out.println("A tarefa: "+tarefa.getDescricao()+" , foi removida com sucesso!" );
    }
    public void listarTarefa(){
        System.out.println(" Lista de tarefas cadastradas: ");
        for(Tarefa tarefa: lista)
        System.out.println(tarefa.getDescricao());
    }

}
