import tarefas.ArrayTarefas;
import tarefas.Tarefa;

public class AppWithArrayTarefas {
  public static void main(String[] args) throws Exception {
    System.out.println("Minhas Tarefas");
    System.out.println("-----------------");

    ArrayTarefas tarefas = new ArrayTarefas(3);

    Tarefa tarefa1 = new Tarefa("regar as plantas");
    Tarefa tarefa2 = new Tarefa("trabalhar");
    Tarefa tarefa3 = new Tarefa("estudar");
    tarefas.adicionar(tarefa1);

    tarefas.adicionar(tarefa2);
    tarefas.adicionar(tarefa3);

    tarefas.exibirTarefas();

  }
}
