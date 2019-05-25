public class SingletonMain {
    public static void main(String[] args){
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        databaseConnection.setCurrentQuery("SELECT * FROM u_users");
        System.out.println("Call to getInstance() #1: ");
        System.out.println("Current query is: " + databaseConnection.getCurrentQuery());

        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        System.out.println("Call to getInstance() #2: ");
        System.out.println("Current query is: " + databaseConnection.getCurrentQuery());

        System.out.println("They are the same object (check their hash): ");
        System.out.println(databaseConnection);
        System.out.println(databaseConnection1);
    }
}
