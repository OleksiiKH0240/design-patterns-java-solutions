import java.util.HashMap;

public class ChatMediator implements Mediator {
    private final HashMap<String, User> users;
    private final HashMap<String, UsersGroup> groups;

    public ChatMediator() {
        users = new HashMap<>();
        groups = new HashMap<>();
    }

    @Override
    public void notify(User user, String message, String groupName, String destUser, String event) {
        if (event.equals("addUser")) {
            addUser(user);
        } else if (event.equals("sendMessage")) {
            sendMessage(message, destUser, user);
        } else if (event.equals("sendMessageAll")) {
            sendMessageAll(message, user);
        } else if (event.equals("createUsersGroup")) {
            createGroup(groupName);
        } else if (event.equals("addUserToUserGroup")) {
            addUserToUsersGroup(user, groupName);
        }
        else if (event.equals("sendMessageToUsersGroup")) {
            sendMessageToUsersGroup(user, message, groupName);
        }
        else {
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

    private void createGroup(String groupName) {
        groups.put(groupName, new UsersGroup(groupName));
    }

    private void addUserToUsersGroup(User user, String groupName) {
        UsersGroup group = groups.get(groupName);
        if (group == null) {
            System.out.println("UsersGroup " + groupName + " does not exist.");
            return;
        }
        group.addUser(user);
    }

    private void sendMessageToUsersGroup(User originUser, String message, String groupName) {
        UsersGroup group = groups.get(groupName);
        if (group != null) {
            group.getUsers().forEach(user -> {
                user.receiveMassage(message, originUser.getUserId());
            });
        } else {
            System.out.println("UsersGroup " + groupName + " does not exist.");
        }
    }
}