package lok.ac.DesignPatterns.Behaviral.Test2_mediator;

import java.util.ArrayList;
import java.util.List;

abstract class ChatMediator{

    abstract public void addUser(User user);
    abstract public void sendMessage(String msg,User user);

}

abstract class User{

    String name;
    ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator){
        this.name = name;
        this.chatMediator = chatMediator;
    }

    abstract public void sendMsg(String msg);
    abstract public void receiveMsg(String msg);
}

class ChatMediatorImp extends ChatMediator{

    List<User> users;

    ChatMediatorImp(){
        users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String msg,User sender) {
        users.parallelStream().forEach( (user)->{
            if(user!=sender){
                user.receiveMsg(user.name+"\n"+msg);
            }

        } );
    }
}

class UserImpl extends User{

    UserImpl( String name, ChatMediator chatMediator ){
        super(name,chatMediator);
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println( this.name+" sending msg : "+ msg );
        chatMediator.sendMessage(msg,this);
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println( "msg Received : "+msg );

    }
}


public class Prac1 {

    public static void main(String[] args) {

        ChatMediator chatGroup = new ChatMediatorImp();
        User user1 = new UserImpl("User1",chatGroup);
        User user2 = new UserImpl("User2",chatGroup);
        User user3 = new UserImpl("User3",chatGroup);
        User user4 = new UserImpl("User4",chatGroup);
        chatGroup.addUser(user1);
        chatGroup.addUser(user2);
        chatGroup.addUser(user3);
        chatGroup.addUser(user4);

        user1.sendMsg("Hi All this is user1");


    }

}
