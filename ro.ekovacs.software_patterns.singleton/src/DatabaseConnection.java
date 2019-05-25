public class DatabaseConnection {

    private static DatabaseConnection instance = null;

    private String currentQuery = "";

    public String getCurrentQuery() {
        return currentQuery;
    }

    public void setCurrentQuery(String currentQuery) {
        this.currentQuery = currentQuery;
    }

    private DatabaseConnection(){
        super();
    }

    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
