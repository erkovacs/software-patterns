public class LockedOut implements LoginState {
    Login login;

    public LockedOut(Login login) {
        this.login = login;
    }

    @Override
    public void login(String username, String password) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException();
    }
}
