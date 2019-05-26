public abstract class UserComponent {
    public void add(UserComponent userComponent){
        throw new UnsupportedOperationException();
    };
    public void remove(int componentIndex){
        throw new UnsupportedOperationException();
    };
    public String getUserName(){
        throw new UnsupportedOperationException();
    }
    public String getUserGroupName(){
        throw new UnsupportedOperationException();
    }
    public String getUserGroupDescription(){
        throw new UnsupportedOperationException();
    }
    public abstract void displayUserInfo();
}
