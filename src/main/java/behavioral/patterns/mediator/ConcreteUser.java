package behavioral.patterns.mediator;

public class ConcreteUser extends User {

    ConcreteUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    protected void receiveMessage(String message) {
        System.out.println(this.name + " received " + message);
    }

    @Override
    protected void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

}
