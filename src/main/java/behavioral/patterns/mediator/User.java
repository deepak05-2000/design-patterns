package behavioral.patterns.mediator;

public abstract class User {
    protected String name;
    protected ChatMediator mediator;
    User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    protected abstract void receiveMessage(String message);
    protected abstract void sendMessage(String message);
}
