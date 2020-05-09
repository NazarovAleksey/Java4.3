public class CreditPaymentService {
    public int calculate(int amount, int years, double rate){
        rate = 9.99 / 12 / 100;
        double coefficient = (rate * Math.pow((1 + rate), years * 12)) / (Math.pow((1 + rate), years * 12) - 1);
        int payment_amount = (int) (coefficient * amount);

        return payment_amount;
    }
}