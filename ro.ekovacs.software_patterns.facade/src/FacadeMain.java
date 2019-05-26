public class FacadeMain {
    public static void main(String[] args){
        BankAccount account = null;
        try {
            System.out.println("Invalid Credentials");
            account = new BankAccount("rosstheboss", "123123123");
        } catch (CredentialsException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Valid Credentials");
            account = new BankAccount("madonna1991", "fa3ba2100d");
            account.deposit(1000.0);
            double sum = account.withdraw(200.0);
            System.out.println("WIthdrawn sum " + sum);
            System.out.println("WIthdrawn larger sum than is available in account...");
            double sum2 = account.withdraw(2000.0);
        } catch (CredentialsException e) {
            e.printStackTrace();
        } catch (InvalidTransactionException e){
            e.printStackTrace();
        }
    }
}
