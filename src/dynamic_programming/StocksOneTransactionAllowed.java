package dynamic_programming;

public class StocksOneTransactionAllowed {
	public static void main(String[] args) {
		int[] prices = {2,3,4,5,1,7,4,6,8,9};
		int lsf = Integer.MAX_VALUE; // least so far
		int op = 0; // Overall Profit
		int pist =0; // Profit if sold today
		
		for(int i=0; i<prices.length;i++) {
			//Check if current price is the least price in the graph
			if(prices[i]< lsf) {
				lsf = prices[i];
			}
			//Calculate profit if sold today
			pist = prices[i] - lsf;
			// Compare profit if sold today today overall profit
			if(pist > op) {
				op = pist;
			}
		}
		System.out.println(op);
	}

}
