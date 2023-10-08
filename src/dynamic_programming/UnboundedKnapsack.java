package dynamic_programming;

public class UnboundedKnapsack {
	public static void main(String[] args) {
		 
		int[] weight = {2,5,1,3,3};
		int[] value = {15,14,10,45,40};
		int targetWeight = 7;
		
		int[] maxValue = new int[targetWeight + 1];
		
		for(int i =0; i< weight.length; i++) {
			for(int j= weight[i]; j<= targetWeight; j++) {
				if(j==0) {
					maxValue[j] = 0;
				}
				else {
					int val =0;
					if(weight[i] <= j) {
					val = value[i] + maxValue[j - weight[i]];	
					}
					maxValue[j] = Math.max(maxValue[j], val);
				}
			}
		}
		System.out.println(maxValue[targetWeight]);
		
	}

}
