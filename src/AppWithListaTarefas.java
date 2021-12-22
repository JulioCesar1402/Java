import tarefas.ListaTarefas;
import tarefas.Tarefa;

public class AppWithListaTarefas {
  public static void main(String[] args) throws Exception {


    ListaTarefas tarefas = new ListaTarefas();

    Tarefa tarefa1 = new Tarefa("regar as plantas logo depois da hora do jantar");
    Tarefa tarefa2 = new Tarefa("trabalhar");
    Tarefa tarefa3 = new Tarefa("Estudar");

    tarefas.adicionar(tarefa1);
    tarefas.adicionar(tarefa2);
    tarefas.adicionar(tarefa3);

    tarefas.adicionar("Comer");

    System.out.println("Minhas Tarefas");
    System.out.println("-----------------");
    tarefas.exibirTarefas();

    tarefas.remover(tarefa1);
    tarefas.remover(tarefa2);
    tarefas.remover(4);

    System.out.println("Minhas Tarefas após remover");
    System.out.println("-----------------");
    tarefas.exibirTarefas();

    System.out.println("-----------------");
    Tarefa tarefa = tarefas.buscar("Estudar");
    Tarefa tarefaNaoExiste = tarefas.buscar("Estudar2");
    tarefa.exibirTarefa();
    tarefaNaoExiste.exibirTarefa();
  }
}
