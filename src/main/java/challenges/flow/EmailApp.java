package challenges.flow;

import flow.*;

import java.util.LinkedList;
import java.util.Queue;

public class EmailApp implements IApp<String> {
  private Queue<String> messages;

  public EmailApp() {
    this.messages = new LinkedList<String>();
  }

  public String in(IEvent event) throws EventException, ProtocolException, ActionException {
    String message = (String) event.trigger(); // recebo um evento
    if(!message.startsWith("MSG:")) { // se o evento for do tipo email, está certo
      throw new ProtocolException(); //senão manda exceção
    }
    message = message.replace("MSG:", "");
    messages.add(message);
    return message;
  }

  public String popMessage() {
    String message = messages.remove();
    return message;
  }

  /**
   * 
    IAgent
    IAction
    IAdapter
    IEvent
    IApp
   * 
   */
}
