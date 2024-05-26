import java.util.HashMap;

public class ChatMediator implements Mediator {
    private final HashMap<String, User> users;

    public ChatMediator() {
        users = new HashMap<>();
    }

    @Override
    public void notify(User user, String message, String destUser, String event) {
        if (event.equals("addUser")) {
            addUser(user);
        } else if (event.equals("sendMessage")) {
            sendMessage(message, destUser, user);
        } else if (event.equals("sendMessageAll")) {
            sendMessageAll(message, user);
        } else {
            System.out.printf("event '%s' is not supported.\n", event);
        }
    }

    private void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    private void sendMessageAll(String message, User originUser) {
        for (User userTo : users.values()) {
            if (!userTo.getUserId().equals(originUser.getUserId())) {
                userTo.receiveMassage(message, originUser.getUserId());
            }
        }
    }

    private void sendMessage(String message, String destUser, User originUser) {
        users.get(destUser).receiveMassage(message, originUser.getUserId());
    }
}