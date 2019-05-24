public class BuilderMain {
    public static void main(String [] args){
        PaymentBuilder paymentBuilder = new LoanPaymentBuilder();
        PaymentEngineer paymentEngineer = new PaymentEngineer(paymentBuilder);
        paymentEngineer.makePayment();
        Payment payment = paymentEngineer.getPayment();

        PaymentBuilder paymentBuilder2 = new CharityPaymentBuilder();
        PaymentEngineer paymentEngineer2 = new PaymentEngineer(paymentBuilder2);
        paymentEngineer2.makePayment();
        Payment payment2 = paymentEngineer2.getPayment();

        System.out.println(payment);
        System.out.println(payment2);
    }
}
