package dynamic_programming;

public class StocksInfiniteTransactionsAllowed {
	public static void main(String[] args) {
		int[] prices = {2,3,4,5,1,7,4,6,8,9};
		int buyIndex = 0, sellIndex = 0;
		int psf =0; // profit so far
		int diff =0;
		
		for(int i=1; i<prices.length;i++) {
			
			if(prices[i] < prices[sellIndex]) {
				diff = prices[sellIndex] - prices[buyIndex];
				psf+=diff;
				buyIndex =i;
				sellIndex = i;
			}
			else {
				sellIndex++;
			}
		}
		psf = psf + (prices[sellIndex] - prices[buyIndex]);
		System.out.println(psf);
	}

}
