package flow.samples;

import flow.ActionException;
import flow.EventException;
import flow.IApp;
import flow.IEvent;

import java.net.ProtocolException;
import java.util.LinkedList;
import java.util.Queue;

import javax.xml.bind.PropertyException;

public class EmailApp implements IApp<String> {
  private Queue<String> messages;

  public EmailApp() {
    this.messages = new LinkedList<String>();
  }

  public String in(IEvent event) throws EventException, ActionException {
    String message = (String) event.trigger(); 
   
    
    message = message.replace("MSG:", "");
    messages.add(message);
    return message;
  }

  public String popMessage() {
    String message = messages.remove();
    return message;
  }

}










