package challenges.flow;

import flow.IAction;

public class UserAction implements IAction<String> {
  private String value;

  public UserAction(String value) {
    this.value = value;
  }

  public String execute() {
    return value;
  }

  public String getType() {
    return "EMAIL";
  }
}
