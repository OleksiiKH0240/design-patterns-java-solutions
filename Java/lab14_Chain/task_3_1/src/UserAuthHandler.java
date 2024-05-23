import java.util.Map;

public class UserAuthHandler extends AbstractAuthHandler {
    UserAuthHandler() {
    }

    @Override
    public void authenticate(Account account, Map<String, String> usersCredentials, Map<String, String> adminsCredentials) {
        if (account.getAccessType() == Account.AccessType.User) {
            String userLogin = account.getLogin();
            String userPassword = account.getPassword();

            String passwordFromUserStorage = usersCredentials.get(userLogin);
            if (userPassword.equals(passwordFromUserStorage)) {
                System.out.println("User access provided: " + userLogin);
            } else {
                System.out.println("Access denied: " + userLogin);
            }
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.authenticate(account, usersCredentials, adminsCredentials);
            }
        }
    }
}
