import java.util.Scanner;

public class BuySellStock {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0; // Edge case: empty input

        int minPrice = prices[0]; // Start with the first price as the minimum price
        int maxProfit = 0; // Start with 0 as the maximum profit

        // Iterate through the prices array starting from the second element
        for (int i = 1; i < prices.length; i++) {
            // Calculate profit if sold at current price
            int profit = prices[i] - minPrice;

            // Update maxProfit if the current profit is greater than the previous maxProfit
            if (profit > maxProfit) {
                maxProfit = profit;
            }

            // Update minPrice if the current price is lower than the previous minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }

    // Main method for testing the solution
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days (array length): ");
        int n = scanner.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter the stock prices for each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        BuySellStock solution = new BuySellStock();
        int maxProfit = solution.maxProfit(prices);
        System.out.println("The maximum profit is: " + maxProfit);

        scanner.close();
    }
}
