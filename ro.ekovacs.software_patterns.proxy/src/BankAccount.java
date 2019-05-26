public class BankAccount implements Account {

    private String state;
    private double balance;

    public BankAccount(){
        state = "ACTIVE";
        balance = 2000.00;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
