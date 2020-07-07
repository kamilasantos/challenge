package challenges.flow;

import flow.*;

public class EmailAdapter implements IAdapter<IAction> {
  public IEvent adapt(IAction action) throws ActionException {
    // executa
    String value = (String) action.execute();
    // retorna o resultado numa ação
    return new EmailEvent(value);
  }
}