import tarefas.Tarefa;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Minhas Tarefas");
    System.out.println("-----------------");

    Tarefa tarefa1 = new Tarefa("regar as plantas");
    tarefa1.exibirTarefa();
    System.out.println("A tarefa tem " + tarefa1.obterTamanhoTarefa() + " caracteres");
  }
}
