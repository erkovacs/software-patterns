public class UtilsCryptography {
    public static final String PASSWORD = "fa3ba2100d";
    public static final String USERNAME = "madonna1991";

    public static boolean verifyCredentials(String username, String password){ return USERNAME.equals(username)&&PASSWORD.equals(password); }
}
