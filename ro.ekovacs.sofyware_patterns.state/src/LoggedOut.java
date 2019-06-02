public class LoggedOut implements LoginState {

    private final static String USERNAME = "erikkovacs";
    private final static String PASSWORD = "password123";
    private final static int MAX_TRIES = 3;
    private static int TRIES = 0;

    Login login;

    public LoggedOut(Login login) {
        this.login = login;
    }

    @Override
    public void login(String username, String password) {
        if(USERNAME.equals(username) && PASSWORD.equals(password)) {
            System.out.println("Logged in!");
            login.setLoginState(login.getLoggedIn());
        } else {
            TRIES++;
            System.out.println(String.format("You still have %d tries.", (MAX_TRIES-TRIES)));
        }
        if(TRIES >= MAX_TRIES){
            System.out.println("Locked out!");
            login.setLoginState(login.getLockedOut());
        }
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException();
    }
}
