
//gitting
public class PaymentProcessing {
    public String paymentType;

    public void paymentMethod(String paymentType) {
        this.paymentType = paymentType;
    }

    public void makePayment() {
        if (paymentType.equalsIgnoreCase("cash")) {
            PayByCash.processCashPayment();
        } else if (paymentType.equalsIgnoreCase("credit")) {
            PayByCredit.processCreditPayment();
        }
    }

    private static class PayByCash {
        public static void processCashPayment() {
            System.out.println("Accept cash payment and return change");
        }
    }
    private static class PayByCredit{
        public static void processCreditPayment(){
            System.out.println("Accept Payment and return receipt");
        }
    }

}
