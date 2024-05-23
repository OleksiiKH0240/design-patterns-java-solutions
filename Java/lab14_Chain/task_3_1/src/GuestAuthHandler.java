import java.util.Map;

public class GuestAuthHandler extends AbstractAuthHandler {
    GuestAuthHandler() {
    }

    @Override
    public void authenticate(Account account, Map<String, String> usersCredentials, Map<String, String> adminsCredentials) {
        if (account.getAccessType() == Account.AccessType.Guest) {
            System.out.println("Guest access provided!");
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.authenticate(account, usersCredentials, adminsCredentials);
            }
        }
    }
}
