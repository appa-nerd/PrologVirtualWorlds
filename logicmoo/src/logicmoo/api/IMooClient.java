package logicmoo.api;

public interface IMooClient {
    public void run();
    public void end();
    public boolean running();
    public IActorCommandParser getActor();
    public IMooClient getClient();
    public boolean isWantingEvents();
    public void setWantingEvents(boolean onoff);
    public boolean receiveEvent(Object event);
    public boolean println(Object message); 
    public boolean printSimple(Object message);
    public boolean printRaw(String message);
    public boolean printFormat(Object results,Object format);
    public boolean printFormat(Object results);
    public Object prompt(Object message);
    public boolean enact(Object goal);
    public void reloadInterpretor();
    public void setParaphrased(boolean onoff);
}


