public class CompositeMain {
    public static void main(String[] args){

        // Create some groups and users
        UserComponent changeManagement = new UserGroup("Change Management", "Deals with Service Transition - change management");
        UserComponent cab = new UserGroup("CAB", "Change Advisory Board");
        UserComponent changeManager = new User("Henry Mann", "Change Manager");
        UserComponent l3Assistant = new User("Maurice Tonks", "L3 Wintel Sysadmin - advisor");
        UserComponent l3Assistant2 = new User("Seetharaman Narachandran", "L3 Wintel Sysadmin - advisor");

        // The L3 guys are going to be part of CAB
        cab.add(l3Assistant);
        cab.add(l3Assistant2);

        // The change manager will not be part of CAB but part of Change Management
        changeManagement.add(changeManager);

        // Add the CAB to Change Management
        changeManagement.add(cab);

        // Display all recursively
        changeManagement.displayUserInfo();
    }
}
