package dynamic_programming;

public class StocksTwoTransactionsAllowed {
	public static void main(String[] args) {
		int[] a = { 30, 40, 43, 50, 45, 20, 26, 40, 80, 50, 30, 15, 10, 20, 40, 45, 71, 50, 55 };

		int lrMaxProfit = 0;
		int lrLeastBuyPoint = a[0];
		int rlMaxSellPoint = a[a.length - 1];
		int rlMaxProfit = 0;

		int[] lr = new int[a.length]; // stores left to right max values
		lr[0] = 0;
		int[] rl = new int[a.length]; // stores right to left max values
		rl[a.length - 1] = 0;

		int sum = 0;
		int maxSum = 0;

		// Left to Right - Find max profit if stock is sold on iTH day
		for (int i = 1; i < a.length; i++) {

			if (a[i] < lrLeastBuyPoint) {
				lrLeastBuyPoint = a[i];
				lr[i] = lrMaxProfit;
			} else {
				lrMaxProfit = Math.max(lrMaxProfit, a[i] - lrLeastBuyPoint);
				lr[i] = lrMaxProfit;
			}

		}

		// Right to left
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] > rlMaxSellPoint) {
				rlMaxSellPoint = a[i];
				rl[i] = rlMaxProfit;
			} else {
				rlMaxProfit = Math.max(rlMaxSellPoint - a[i], rlMaxProfit);
				rl[i] = rlMaxProfit;
			}
		}

		// Sum of lr and rl
		for (int i = 0; i < a.length - 1; i++) {
			sum = lr[i] + rl[i];
			maxSum = Math.max(maxSum, sum);
		}

		System.out.println(maxSum);

	}
}
