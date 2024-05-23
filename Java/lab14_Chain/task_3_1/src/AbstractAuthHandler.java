import java.util.Map;

public abstract class AbstractAuthHandler {
    protected AbstractAuthHandler nextHandler;

    public void setNextHandler(AbstractAuthHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void authenticate(Account account,
                                      Map<String, String> usersCredentials,
                                      Map<String, String> adminsCredentials);
}
