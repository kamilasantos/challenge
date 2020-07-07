package challenges.flow;

import flow.IAction;
import flow.IAgent;

import java.util.LinkedList;
import java.util.List;

public class UserAgent implements IAgent {
  private String[] values;

  public UserAgent(String... values) {
    this.values = values; // guardar todas as mensagens
  }

  public List<IAction> act() { // Atuar : Transformar os valores em ações
    List<IAction> flow = new LinkedList<IAction>();
    for (String value : values) {
      flow.add(new UserAction(value));
      // Para todos os valores, criar uma ação para cada um deles
      // UserAction a Acção typo : Email
    }
    return flow;
  }
}
