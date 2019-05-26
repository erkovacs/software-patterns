public class ProxyMain {
    public static void main(String[] args){
        Account account = new BankAccount();
        System.out.println("Full Access to account");
        ((BankAccount) account).setBalance(210000.0);
        ((BankAccount) account).setState("TERMINATED");
        System.out.println(String.format("Account #1: State: %s, Balance %.2f", account.getState(), account.getBalance()));

        System.out.println("Read-only access to account");
        Account account1 = new BankAccountProxy();
        System.out.println(String.format("Account #2: State: %s, Balance %.2f", account1.getState(), account1.getBalance()));
    }
}
