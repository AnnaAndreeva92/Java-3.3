public class Main {
    public static void main(String[] args) {
        CreditPaymentService monthyPayment = new CreditPaymentService();
        double playment = monthyPayment.calculaste(1_000_000, 1);
        System.out.println();

        double playment2 = monthyPayment.calculaste(1_000_000, 2);
        System.out.println();

        double plaayment3 = monthyPayment.calculaste(1_000_000, 3);
        System.out.println();
    }
}
