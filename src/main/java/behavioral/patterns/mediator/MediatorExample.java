package behavioral.patterns.mediator;

public class MediatorExample {
    public static void main(String[] args) {
        ChatMediator mediator = new Mediator();
        User user1 = new ConcreteUser(mediator, "john");
        User user2 = new ConcreteUser(mediator, "doe");
        User user3 = new ConcreteUser(mediator, "dani");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        user1.sendMessage("Hi I am John");
    }
}
