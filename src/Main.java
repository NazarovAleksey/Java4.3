public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int theAmountOfTheLoanPaymentForOneYear = service.calculate(1_000_000,1,9.99);
        System.out.println("Ежемесячный платеж при сроке кредита 1 год составит: " + theAmountOfTheLoanPaymentForOneYear + " рублей");

        int theAmountOfTheLoanPaymentForTwoYears = service.calculate(1_000_000,2,9.99);
        System.out.println("Ежемесячный платеж при сроке кредита 2 года составит: " + theAmountOfTheLoanPaymentForTwoYears + " рублей");

        int theAmountOfTheLoanPaymentForThreeYears = service.calculate(1_000_000,3,9.99);
        System.out.println("Ежемесячный платеж при сроке кредита 3 года составит: " + theAmountOfTheLoanPaymentForThreeYears + " рублей");
    }
}