import java.util.HashSet;
import java.util.Set;

public class UsersGroup {
    private final String groupName;
    private final Set<User> users;

    public UsersGroup(String groupName) {
        this.groupName = groupName;
        users = new HashSet<>();
    }

    public Set<User> getUsers() {
        return users;
    }

    public String getGroupName() {
        return groupName;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
