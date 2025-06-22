package DataStructures.FinancialForecasting;

public class Forecast {

    public static double predictFutureValue(double initialValue, double rate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return predictFutureValue(initialValue * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double initial = 10000;
        double rate = 0.08;
        int years = 5;

        double future = predictFutureValue(initial, rate, years);
        System.out.printf("Predicted value after %d years: INR %.2f\n", years, future);
    }
}
