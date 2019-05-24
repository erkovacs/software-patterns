import java.util.Date;

public interface PaymentPlan {
    public void setPaymentCurrency(String currency);
    public void setPaymentDate(Date date);
    public void setPaymentPeriod(int days);
    public void setPaymentAmount(double amount);
}
