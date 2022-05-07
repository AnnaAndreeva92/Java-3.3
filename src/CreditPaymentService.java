public class CreditPaymentService {

    public double calculaste(double amount, double years) {
        double months = years * 12;
        double percent = amount * 9.99 / 100;
        double payment = (amount + percent) / months;
        System.out.println(("Ежемесячный платеж:") + payment);

        return payment;
    }
}
