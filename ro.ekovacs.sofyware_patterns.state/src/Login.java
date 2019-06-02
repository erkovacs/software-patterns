
public class Login {

    LoginState loggedIn;
    LoginState loggedOut;
    LoginState lockedOut;
    LoginState loginState;

    public Login() {
        loggedIn = new LoggedIn(this);
        loggedOut = new LoggedOut(this);
        lockedOut = new LockedOut(this);
        loginState = new LoggedOut(this);
    }

    public LoginState getLoggedIn() {
        return loggedIn;
    }

    public LoginState getLoggedOut() {
        return loggedOut;
    }

    public LoginState getLockedOut() {
        return lockedOut;
    }

    public LoginState getLoginState() {
        return loginState;
    }

    public void setLoginState(LoginState loginState) {
        this.loginState = loginState;
    }

    public boolean isLocked() { return loginState instanceof LockedOut; }

    public boolean isLoggedIn() { return loggedIn instanceof LoggedIn; }

    public void login(String username, String password){
        loginState.login(username, password);
    }

    public void logout(){
        loginState.logout();
    }
}
