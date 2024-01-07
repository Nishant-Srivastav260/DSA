package dynamic_programming;

public class StocksFeeOnSellInfiniteTransaction {
	public static void main(String[] args) {
		
		int[] a = {2,3,4,5,1,7,4,6,8,9};
		int fee = 2;
		int bsp = -a[0]; // bought state profit
		int ssp = 0; // sold state profit
		int tempBoughtState = -a[0];
		
		for(int i =1; i< a.length; i++) {
			//Determine bsf
			if((ssp - a[i]) > bsp) {
				bsp = ssp - a[i];
				
			}
			//Determine ssp
			if((a[i] - fee + tempBoughtState) > ssp) {
				ssp = a[i] - fee + tempBoughtState;
			}
			tempBoughtState = bsp;
		}
		System.out.println(ssp);
	}

}
