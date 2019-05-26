public class AccountBalance {
    private double balance;

    public AccountBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double sum) throws InvalidTransactionException {
        if(sum < 0) throw new InvalidTransactionException();
        balance += sum;
    }

    public double withdraw(double sum) throws InvalidTransactionException {
        if(sum < 0 || sum > balance) throw new InvalidTransactionException();
        balance -= sum;
        return sum;
    }
}
