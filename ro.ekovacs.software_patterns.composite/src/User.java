public class User extends UserComponent {
    private String userName;
    private String userDescription;

    @Override
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public User(String userName, String userDescription){
        this.userDescription = userDescription;
        this.userName = userName;
    }

    @Override
    public void displayUserInfo() {
        System.out.println(userName + " : " + userDescription + "\n");
    }
}
