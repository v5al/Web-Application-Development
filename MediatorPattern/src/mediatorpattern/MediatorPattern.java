package mediatorpattern;
public class MediatorPattern {
    public static void main(String[] args) {
        IChatRoom chatroom = new Mediator();
        
        User user1 = new ChatUser(chatroom,"1","A");
        User user2 = new ChatUser(chatroom,"2","B");
        
        chatroom.addUser(user1);
        chatroom.addUser(user2);
        
        user1.send("Hello B !!","2");
        user2.send("Hi A !!", "1");
    }
}