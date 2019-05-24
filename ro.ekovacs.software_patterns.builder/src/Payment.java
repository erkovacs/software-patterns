import java.util.Date;

public class Payment implements PaymentPlan {

    private String paymentCurrency;
    private Date paymentDate;
    private int paymentPeriod;
    private double paymentAmount;

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public int getPaymentPeriod() {
        return paymentPeriod;
    }

    @Override
    public void setPaymentCurrency(String currency) {
        paymentCurrency = currency;
    }

    @Override
    public void setPaymentDate(Date date) {
        paymentDate = date;
    }

    @Override
    public void setPaymentPeriod(int days) {
        paymentPeriod = days;
    }

    @Override
    public void setPaymentAmount(double amount) {
        paymentAmount =  amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentCurrency='" + paymentCurrency + '\'' +
                ", paymentDate=" + paymentDate +
                ", paymentPeriod=" + paymentPeriod +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}
