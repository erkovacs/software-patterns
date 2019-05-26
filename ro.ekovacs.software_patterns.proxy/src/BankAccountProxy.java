public class BankAccountProxy implements Account {
    @Override
    public String getState() {
        BankAccount bankAccount = new BankAccount();
        return bankAccount.getState();
    }

    @Override
    public double getBalance() {
        BankAccount bankAccount = new BankAccount();
        return bankAccount.getBalance();
    }
}
