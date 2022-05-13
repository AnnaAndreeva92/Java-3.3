public class CreditPaymentService {

    public double calculaste(double amount, double years) {
        double months = years * 12;
        double percent = 9.99 / (100 * 12);
        double coefficient = 1 + percent;
        double monthlyCommission = Math.pow(coefficient, months);
        double payment = amount * (percent * monthlyCommission) / (monthlyCommission - 1);

        System.out.println(" Ежемесячный платеж:" + payment);

        return payment;
    }
}
