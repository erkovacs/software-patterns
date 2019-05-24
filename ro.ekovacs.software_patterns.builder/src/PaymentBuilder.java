public interface PaymentBuilder {
    public void buildPaymentCurrency();
    public void buildPaymentDate();
    public void buildPaymentPeriod();
    public void buildPaymentAmount();

    public Payment getPayment();
}
