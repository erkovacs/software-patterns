import java.util.Scanner;

public class StateMain {
    public static void main(String[] args){

        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        while(!login.isLocked()){
            try {
                System.out.println("Please enter your usename:");
                String username = scanner.nextLine();
                System.out.println("Please enter your password:");
                String password = scanner.nextLine();

                System.out.println(username + " " + password);
                login.login(username, password);
                if(login.isLoggedIn()){
                    break;
                }
            } catch (UnsupportedOperationException uoe){
                uoe.printStackTrace();
                break;
            }
        }
        if(!login.isLocked()) {
            System.out.println("Do you want to log out? y/n:");
            String answer = scanner.nextLine();
            if ("y".equals(answer)) {
                login.logout();
            }
        }
    }
}
