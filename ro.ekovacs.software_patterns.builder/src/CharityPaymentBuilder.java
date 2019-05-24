import java.util.Date;

public class CharityPaymentBuilder implements PaymentBuilder {

    Payment payment;

    public CharityPaymentBuilder() {
        this.payment = new Payment();
    }

    @Override
    public void buildPaymentCurrency() {
        payment.setPaymentCurrency("EUR");
    }

    @Override
    public void buildPaymentDate() {
        payment.setPaymentDate(new Date());
    }

    @Override
    public void buildPaymentPeriod() {
        payment.setPaymentPeriod(60);
    }

    @Override
    public void buildPaymentAmount() {
        payment.setPaymentAmount(300.0);
    }

    @Override
    public Payment getPayment() {
        return payment;
    }
}
