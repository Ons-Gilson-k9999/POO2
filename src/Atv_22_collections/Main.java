package Atv_22_collections;

public class Main {
    public static void main(String[] args){
        ListaTarefas lista= new ListaTarefas();

        Tarefa tarefa1 = new Tarefa(" Armação ");
        Tarefa tarefa2 = new Tarefa(" Construção ");
        Tarefa tarefa3 = new Tarefa(" Montagem ");

        lista.adicionarTarefa(tarefa1);
        lista.adicionarTarefa(tarefa2);
        lista.adicionarTarefa(tarefa3);

        lista.listarTarefa();

        lista.removerTarefa(tarefa2);

        lista.listarTarefa();


    }
}
