public interface User {
    void sendMessageAll(String message);

    void sendMessage(String message, String userTo);

    void receiveMassage(String message, String userFrom);

    String getUserId();
    void createUsersGroup(String groupName);
    void addUserToUsersGroup(User user, String groupName);
    void sendMessageToUsersGroup(String message, String groupName);
}
