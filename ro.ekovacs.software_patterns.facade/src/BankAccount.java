public class BankAccount {

    private static final double INITIAL_SUM = 1000.0;

    private AccountBalance balance;
    private String username;

    public BankAccount(String username, String password) throws CredentialsException {
        if( UtilsCryptography.verifyCredentials(username, password) ){
            this.balance = new AccountBalance(INITIAL_SUM);
            this.username = username;
        } else {
            throw new CredentialsException();
        }
    }

    public void deposit(double sum) throws InvalidTransactionException {
       balance.deposit(sum);
    }

    public double withdraw(double sum) throws InvalidTransactionException {
       return balance.withdraw(sum);
    }
}
