import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        // Login and passwords for administrators
        Map<String, String> adminsAccounts = new HashMap<>();
        adminsAccounts.put("admin", "123qweASD");
        adminsAccounts.put("administrator", "1234");

        // Login and passwords for users
        Map<String, String> usersAccounts = new HashMap<>();
        usersAccounts.put("andrii", "1234");
        usersAccounts.put("black_knight", "S@ruman1");
        usersAccounts.put("white_knight", "ruman1");

        Account[] users = {
            Account.createAdmin("admin", "123qweASD"),
            Account.createAdmin("administrator", "1234"),
            Account.createUser("andrii", "1234"),
            Account.createGuest(),
            Account.createUser("black_knight", "S@ruman1"),
            Account.createUser("white_knight", "S111"),
            Account.createGuest(),
        };

        AbstractAuthHandler middleware = new GuestAuthHandler();

        UserAuthHandler userAuthHandler = new UserAuthHandler();
        middleware.setNextHandler(userAuthHandler);

        AdminAuthHandler adminAuthHandler = new AdminAuthHandler();
        userAuthHandler.setNextHandler(adminAuthHandler);


        for (Account user : users) {
            middleware.authenticate(user, usersAccounts, adminsAccounts);
        }
    }
}
