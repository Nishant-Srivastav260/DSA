package dynamic_programming;

public class ZeroOneKnapsack {
	public static void main(String[] args) {
		
		
		int[] weight = {2,5,1,3,3};
		int[] value = {15,14,10,45,40};
		int targetWeight = 7;
		
		int[][] maxValue = new int[weight.length + 1][targetWeight+ 1];
		
		for(int i= 0; i< maxValue.length; i++) {
			for(int j = 0; j < maxValue[0].length; j++) {
				if(i ==0 || j==0) {
					maxValue[i][j] = 0;
				}
				else {
					int missed = maxValue[i-1][j];
					int val =0;
					if(weight[i-1] <= j) {
						val = value[i-1] + maxValue[i-1][j - weight[i-1]];
					}
					maxValue[i][j] = Math.max(missed, val);
					
				}
			}
		}
		
		System.out.println(maxValue[weight.length][targetWeight]);
	}

}
