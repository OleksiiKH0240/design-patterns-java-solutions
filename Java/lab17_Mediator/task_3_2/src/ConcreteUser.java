public class ConcreteUser implements User {

    final private String userId;
    private final Mediator mediator;

    public ConcreteUser(String userId, Mediator mediator) {
        this.userId = userId;
        this.mediator = mediator;
        mediator.notify(this, null, null, null, "addUser");
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void sendMessageAll(String message) {
        this.mediator.notify(this, message, null, null, "sendMessageAll");
    }

    @Override
    public void sendMessage(String message, String userTo) {
        this.mediator.notify(this, message, null, userTo, "sendMessage");
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }

    @Override
    public void createUsersGroup(String groupName) {
        this.mediator.notify(null, null, groupName, null, "createUsersGroup");
    }

    @Override
    public void addUserToUsersGroup(User user, String groupName) {
        this.mediator.notify(user, null, groupName, null, "addUserToUserGroup");
    }

    @Override
    public void sendMessageToUsersGroup(String message, String groupName) {
        this.mediator.notify(this, message, groupName, null, "sendMessageToUsersGroup");
    }
}
