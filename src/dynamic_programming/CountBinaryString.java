package dynamic_programming;

public class CountBinaryString {
	public static void main(String[] args) {
		
		int lengthOfString = 6;
		 
		int oldCountOfZeros = 1;
		int oldCountOfOnes = 1;
		
		for(int i =2; i <= lengthOfString; i++) {
			
			int newCountOfZeros = oldCountOfOnes;
			int newCountOfOnes = oldCountOfOnes + oldCountOfZeros;
			
			oldCountOfZeros = newCountOfZeros;
			oldCountOfOnes = newCountOfOnes;
		}
		
		System.out.println(oldCountOfOnes + oldCountOfZeros);
	}

}
