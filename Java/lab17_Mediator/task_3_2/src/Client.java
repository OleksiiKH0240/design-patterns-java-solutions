public class Client {

    public static void main(String[] args) {

        Mediator chatMediator = new ChatMediator();
        ConcreteUser user1 = new ConcreteUser("User1", chatMediator);
        ConcreteUser user2 = new ConcreteUser("User2", chatMediator);
        ConcreteUser user3 = new ConcreteUser("User3", chatMediator);
        ConcreteUser user4 = new ConcreteUser("User4", chatMediator);
        ConcreteUser user5 = new ConcreteUser("User5", chatMediator);
        ConcreteUser user6 = new ConcreteUser("User6", chatMediator);

        user1.sendMessageAll("Hello, world!");

        user2.sendMessage("Hello!", "User1");

        user3.createUsersGroup("Group1");
        user3.addUserToUsersGroup(user4, "Group1");
        user3.addUserToUsersGroup(user5, "Group1");
        user3.addUserToUsersGroup(user6, "Group1");

        user3.sendMessageToUsersGroup("message for group1", "Group1");
    }

}
