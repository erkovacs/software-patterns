public class PaymentEngineer {
    private PaymentBuilder paymentBuilder;

    public PaymentEngineer(PaymentBuilder paymentBuilder) {
        this.paymentBuilder = paymentBuilder;
    }

    public void makePayment(){
        paymentBuilder.buildPaymentCurrency();
        paymentBuilder.buildPaymentDate();
        paymentBuilder.buildPaymentPeriod();
        paymentBuilder.buildPaymentAmount();
    }

    public Payment getPayment(){
        return paymentBuilder.getPayment();
    }
}
