import java.util.Date;

public class LoanPaymentBuilder  implements PaymentBuilder {

    private Payment payment;

    public LoanPaymentBuilder() {
        this.payment = new Payment();
    }

    @Override
    public void buildPaymentCurrency() {
        payment.setPaymentCurrency("RON");
    }

    @Override
    public void buildPaymentDate() {
        payment.setPaymentDate(new Date());
    }

    @Override
    public void buildPaymentPeriod() {
        payment.setPaymentPeriod(30);
    }

    @Override
    public void buildPaymentAmount() {
        payment.setPaymentAmount(1000.0);
    }

    @Override
    public Payment getPayment() {
        return payment;
    }
}
