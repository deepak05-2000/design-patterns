package behavioral.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements ChatMediator {
    List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        System.out.println(sender.name + " sends " + message);
        for(User user : users) {
            if(user != sender) user.receiveMessage(message);
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
