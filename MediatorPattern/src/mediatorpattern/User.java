package mediatorpattern;
public abstract class User {
    private IChatRoom mediator;
    private String name;
    private String id;
    public User(IChatRoom room, String id, String name){
        this.mediator = room;
        this.id = id;
        this.name = name;
    }
    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);
    public IChatRoom getMediator(){
        return mediator;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}