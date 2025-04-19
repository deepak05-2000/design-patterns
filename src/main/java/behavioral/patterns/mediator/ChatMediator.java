package behavioral.patterns.mediator;

public interface ChatMediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
}
