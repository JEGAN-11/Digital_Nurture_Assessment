public class FinancialForecast {

    public static void main(String[] args) {

        double investment = 50000;
        double annualGrowthRate = 0.08;
        int years = 6;

        double futureValue = calculateFutureValue(
                investment,
                annualGrowthRate,
                years
        );

        System.out.println("Financial Forecast");
        System.out.println("--------------------------");
        System.out.println("Initial Investment : Rs. " + investment);
        System.out.println("Annual Growth Rate : " + (annualGrowthRate * 100) + "%");
        System.out.println("Forecast Period    : " + years + " years");
        System.out.println("Future Value       : Rs. " + futureValue);

        System.out.println("\nTime Complexity Analysis");
        System.out.println("Recursive Algorithm : O(n)");
        System.out.println("Space Complexity    : O(n) (due to recursive call stack)");
        System.out.println("Optimization        : Use iteration or memoization to avoid unnecessary recursive calls.");
    }

    public static double calculateFutureValue(double amount, double rate, int years) {

        if (years == 0) {
            return amount;
        }

        return calculateFutureValue(
                amount * (1 + rate),
                rate,
                years - 1
        );
    }
}