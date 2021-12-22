import tarefas.ListaTarefas;

public class Lista {
  public static void main(String[] args) throws Exception {
    ListaTarefas tarefas = new ListaTarefas();

    tarefas.adicionar("trabalhar");
    tarefas.adicionar("Estudar");
    tarefas.adicionar("Comer");

    System.out.println("Minhas Tarefas");
    System.out.println("-----------------");
    tarefas.exibirTarefas();
  }
}
