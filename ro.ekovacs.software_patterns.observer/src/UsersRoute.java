public class UsersRoute implements Observer {
    private final static String route = "/users";

    @Override
    public void update(String update) {
        if(update.contains("GET") && update.contains(route)){
            System.out.println("HTTP GET to route /users");
        } else {
            System.out.println("Update was a no-op");
        }
    }
}
