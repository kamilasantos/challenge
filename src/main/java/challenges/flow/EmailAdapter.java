package flow.samples;

import flow.*;

public class EmailAdapter implements IAdapter<IAction> {
  public IEvent adapt(IAction action) throws ActionException {
    String value = (String) action.execute();
    return new EmailEvent(value);
  }
}