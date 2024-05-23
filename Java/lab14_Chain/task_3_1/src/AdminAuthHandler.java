import java.util.Map;

public class AdminAuthHandler extends AbstractAuthHandler {
    AdminAuthHandler() {
    }

    @Override
    public void authenticate(Account account, Map<String, String> usersCredentials, Map<String, String> adminsCredentials) {
        if (account.getAccessType() == Account.AccessType.Administrator) {
            String userLogin = account.getLogin();
            String userPassword = account.getPassword();

            String passwordFromAdminsStorage = adminsCredentials.get(userLogin);
            if (userPassword.equals(passwordFromAdminsStorage) && userPassword.length() >= 8) {
                System.out.println("Administrator access provided: " + userLogin);
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
