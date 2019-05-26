import java.util.ArrayList;

public class UserGroup extends UserComponent {
    private String groupName;
    private String groupDescription;
    private ArrayList<UserComponent> userComponents = new ArrayList<>();

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public UserGroup(String groupName, String groupDescription){
        this.groupDescription = groupDescription;
        this.groupName = groupName;
    }

    @Override
    public void add(UserComponent userComponent) {
        userComponents.add(userComponent);
    }

    @Override
    public void remove(int componentIndex) {
        userComponents.remove(componentIndex);
    }

    public UserComponent getUserComponent(int componentIndex){
        return userComponents.get(componentIndex);
    }

    @Override
    public String getUserGroupName(){
        return groupName;
    }

    @Override
    public String getUserGroupDescription(){
        return groupDescription;
    }

    @Override
    public void displayUserInfo() {
        System.out.println(groupName + " : " + groupDescription + "\n");
        for(UserComponent userComponent : userComponents){
           userComponent.displayUserInfo();
        }
    }
}
