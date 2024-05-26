public interface Mediator {
    public void notify(User user, String message, String groupName, String destUser, String event);
}
