public class LoggedIn implements LoginState {

    Login login;

    public LoggedIn(Login login) {
        this.login = login;
    }

    @Override
    public void login(String username, String password) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void logout() {
        System.out.println("Logged out!");
        login.setLoginState(login.getLoggedOut());
    }
}
