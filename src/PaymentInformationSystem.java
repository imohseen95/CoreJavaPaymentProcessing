import java.util.Scanner;
public class PaymentInformationSystem{
    public static void main(String[] args) {
        PaymentProcessing paymentProcessing = new PaymentProcessing();
        System.out.println("Please Select Payment method : 1)cash 2)credit " );
        Scanner sc = new Scanner (System.in);
        paymentProcessing.paymentType = sc.next();
        paymentProcessing.makePayment();
    }
}